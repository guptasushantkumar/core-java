package com.sushant.generics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Parametrized {

	public static void main3(String[] args) {

		Set<?> setOfRawType = new HashSet<String>();
		setOfRawType = new HashSet<Integer>();

		Set<Object> setOfAnyType = new HashSet<Object>();
		setOfAnyType.add("abc"); // legal
		setOfAnyType.add(new Float(3.0f)); // legal - <Object> can accept any
											// type

		setOfRawType = setOfAnyType;
		// setOfAnyType = setOfRawType;

		Set<? extends Object> setOfString = new HashSet<String>(); // valid in
																	// Generics
		setOfString = new TreeSet<Integer>(); // Ok

		Set<? super TreeMap> setOfAllSuperTypeOfTreeMap = new LinkedHashSet<TreeMap>();

		setOfAllSuperTypeOfTreeMap = new HashSet<SortedMap>(); // legal because
																// SorteMap is
																// super class
																// of TreeMap
		setOfAllSuperTypeOfTreeMap = new LinkedHashSet<Map>();

		identical(setOfAllSuperTypeOfTreeMap);

	}

	public static <T> T identical(T source) {
		return source;
	}

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("test");
		for (Object obj : l) {
			System.out.println((String) obj);
		}
	}
}
