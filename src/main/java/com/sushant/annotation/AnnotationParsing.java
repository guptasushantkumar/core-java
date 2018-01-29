package com.sushant.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationParsing {

	public static void main(String[] args) {
		try {
			for (Method method : AnnotationParsing.class.getClassLoader()
					.loadClass("org.gradle.AnnotationExample").getMethods()) {
				// checks if MethodInfo annotation is present for the method
				if (method
						.isAnnotationPresent(com.sushant.annotation.MethodInformation.class)) {
					try {
						// iterates all the annotations available in the method
						for (Annotation anno : method.getDeclaredAnnotations()) {
							System.out.println("Annotation in Method '"
									+ method + "' : " + anno);
						}
						MethodInformation methodAnno = method
								.getAnnotation(MethodInformation.class);
						if (methodAnno.revision() == 1) {
							System.out.println("Method with revision no 1 = "
									+ method);
						}

					} catch (Throwable ex) {
						ex.printStackTrace();
					}
				}
			}
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
