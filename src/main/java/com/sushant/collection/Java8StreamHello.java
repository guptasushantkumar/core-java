package com.sushant.collection;

import java.util.ArrayList;
import java.util.List;

public class Java8StreamHello {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			list.add(i);

		System.out.println(list.stream().filter(t -> t > 99).mapToInt(t -> t)
				. sum());
	}
}
