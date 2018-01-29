package com.sushant.classesandinterfaces;

public class Child extends Parent{

	{
		System.out.println("Instance block");
	}
	public Child(String name, String sex) {
		super(name, sex);
		System.out.println("Booper");
	}

	protected void callParent(){System.out.println("Child calling parent");}
	
	final void callPolice(){System.out.println("Child calling police");}
	
	public static void main(String[] args) {
		Parent p = new Child("Lokesh", "22");
		StringBuffer s = new StringBuffer();
	}
}
