package com.sushant.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Java8Eight {
	public static void main(String[] args) {
//		System.out.println(isPrime(7));
		List<Integer> numbers = Arrays.asList(new Integer[]{1,2,3,4}); 
		System.out.println(sumWithCondition(numbers, n ->  n%2==0));;
	}

	/**
	 * @param number
	 * @return
	 */
	private static boolean isPrime(int number) {
		/*if (number < 2)
			return false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
		*/
		IntPredicate isDivisible = tamatar -> number % tamatar == 0;
	     
	    return number > 1
	            && IntStream.range(2, number).noneMatch(
	                    isDivisible);
	}
	
	public static int sumWithCondition(List<Integer> numbers,
			Predicate<Integer> predicate) {
		return numbers.parallelStream().filter(predicate).mapToInt(i -> i)
				.sum();
	}
	
	public static int findSquareOfMaxOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(Java8Eight::isOdd)      //Predicate is functional interface and
                .filter(Java8Eight::isGreaterThan3) // we are using lambdas to initialize it
                .filter(Java8Eight::isLessThan11)   // rather than anonymous inner classes
                .max(Comparator.naturalOrder())
                .map(i -> i * i)
                .get();
    }
 
    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }
     
    public static boolean isGreaterThan3(int i){
        return i > 3;
    }
     
    public static boolean isLessThan11(int i){
        return i < 11;
    }
}
