package com.sushant.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println(calculate());
	}

	static int calculate() throws RuntimeException{
		try {
			return 1 / 0;
		} catch (Exception e) {
			throw e;
		} finally {
//			return 1;
		}
	}
}
