package com.sushant.classesandinterfaces;

@FunctionalInterface
public interface Java8Shape {
	Runnable r1 = () -> {
		System.out.println("My Runnable");
		System.out.println("Your runnable");
	};

	void test();

	default void print(String str) {
		if (!isNull(str))
			System.out.println("Shape Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}