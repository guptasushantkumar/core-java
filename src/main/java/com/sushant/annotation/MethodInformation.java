package com.sushant.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author prashant
 *
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInformation {

	/**
	 * @return
	 */
	String author() default "Pankaj";

	/**
	 * @return
	 */
	String date();

	/**
	 * @return
	 */
	int revision() default 1;

	/**
	 * @return
	 */
	String comments();
}
