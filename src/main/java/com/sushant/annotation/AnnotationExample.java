package com.sushant.annotation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

class AnnotationExample {

	public static void main(String[] args) {
		oldMethod();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	@MethodInformation(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 1)
	public String toString() {
		return "Overriden toString method";
	}

	/**
	 * Deprecated method
	 */
	@Deprecated
	@MethodInformation(comments = "deprecated method", date = "Nov 17 2012")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	/**
	 * @throws FileNotFoundException
	 */
	@SuppressWarnings({ "unchecked" })
	@MethodInformation(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 10)
	public static void genericsTest() throws FileNotFoundException {
		@SuppressWarnings("rawtypes")
		List l = new ArrayList();
		l.add("abc");
		oldMethod();
	}
}
