package com.sushant.threads;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountdownLatchDemo {

	public static void main(String[] args) throws Exception {
		final CountDownLatch testLatch = new CountDownLatch(2);
		ExecutorService executor = Executors.newFixedThreadPool(1);
		ASyncProcessor processor = new ASyncProcessor(new Observer() {
			@Override
			public void update(Observable o, Object arg) {
				System.out.println("Counting down...");
				testLatch.countDown();
			}
		});
		long time = System.currentTimeMillis();
		System.out.println("Start waiting");
		executor.submit(processor);
		executor.submit(processor);
		testLatch.await(10000, TimeUnit.MILLISECONDS);
		
		System.out.println("Submitted tasks. Time to wait...");

		long totalTime = System.currentTimeMillis() - time;
		System.out.println("I awaited for " + totalTime
				+ "ms. Did latch count down? " + (testLatch.getCount() == 0));
		executor.shutdown();

	}

}

class ASyncProcessor implements Callable<Object> {

	private Observer listener;

	public ASyncProcessor(Observer listener) {
		this.listener = listener;
	}

	@Override
	public Object call() throws Exception {
		int sleepTime = new Random().nextInt(2000)*2;
		System.out.println("Sleeping for " + sleepTime + "ms");
		Thread.sleep(sleepTime);
		listener.update(null, null);
		return null;
	}

}