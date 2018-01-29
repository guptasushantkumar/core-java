package com.sushant.generics;

public class GenericsTypeOld {

	private Object t;
	
	public Object get(){
		return t;
	}
	
	public void set(Object t){
		this.t = t;
	}
	
	public static void main(String[] args) {
		GenericsTypeOld old = new GenericsTypeOld();
		old.set("Pankaj");
		System.out.println((Integer)old.get());
	}
	
}
