package com.sushant.classesandinterfaces;

public class Parent {

	private String name;
	
	private String sex;

	public Parent(String name, String sex) {
		this.name = name;
		this.sex = sex;
		System.out.println("Super");
	}
	
	protected void callParent(){System.out.println("Parent calling parent");}
	
	private final void callPolice(){System.out.println("Parent calling police "+name);}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}
}

