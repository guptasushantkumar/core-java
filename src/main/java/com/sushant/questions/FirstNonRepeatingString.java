package com.sushant.questions;

import java.util.LinkedHashMap;

public class FirstNonRepeatingString {

	private static String sample = "aabcedabcdf";

	public static void main(String[] args) {
		char[] sampleChars = sample.toCharArray();
		LinkedHashMap<Character, Integer> holder = new LinkedHashMap<>();
		for (int i = 0; i < sampleChars.length; i++) {
			char c = sampleChars[i];
			if (holder.containsKey(c)) {
				holder.put(c, holder.get(c) + 1);
			} else {
				holder.put(c, 1);
			}
		}
		for (int i = 0; i < sample.length(); i++) {
			char c = sample.charAt(i);
			if (holder.get(c) == 1) {
				System.out.println(c);
				break;
			}
		}
	}

}
