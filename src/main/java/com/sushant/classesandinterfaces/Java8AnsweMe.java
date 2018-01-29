package com.sushant.classesandinterfaces;

public class Java8AnsweMe implements Java8Shape {

//	@Override
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		Java8AnsweMe obj = new Java8AnsweMe();
		obj.print("");
		obj.isNull("abc");
		obj.print("abc");
		r1.run();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
