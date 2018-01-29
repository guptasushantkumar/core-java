package com.sushant.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeNew<T> implements Comparable<T>{

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		GenericTypeNew<String> type = new GenericTypeNew<>();
        type.set("Pankaj"); //valid
         
        GenericTypeNew<Integer> type1 = new GenericTypeNew(); //raw type
        type1.set(10); //valid and autoboxing support
        
        GenericMethods.isEqual(type, type);
        GenericMethods.compare(type.get(), type.get());
        
        List<Integer> ints = new ArrayList<>();
        ints.add(3); ints.add(5); ints.add(10);
        double sum = sum(ints);
        System.out.println("Sum of ints="+sum);
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static double sum (List<? extends Number> list){
		double sum =0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}
}

class GenericMethods{
	
	public static <T> boolean isEqual(GenericTypeNew<T> g1, GenericTypeNew<T> g2){
		return g1.get().equals(g2.get());
	}
	
	public static <T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }
}