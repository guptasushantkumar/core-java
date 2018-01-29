package com.sushant.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountNumberofUniqueChars {

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

		System.out.println(holder);
	}

	public static <K, V extends Comparable<V>> Map<K, V> sortByValue(
			Map<K, V> map) {
		List<Map.Entry<K, V>> list = new ArrayList<Map.Entry<K, V>>(
				map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
}
