package com.sushant.collection;

import java.util.ArrayList;
import java.util.List;

public class Java8ForEach {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		myList.forEach(t -> {
			if (t % 2 == 0)
				System.out.println("foreach value: " + t);
		});
	}
}
