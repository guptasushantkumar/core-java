package com.sushant.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ThisCoversEverything {

	static class Sushant{
		private String name;
		private Set<String> nameSet;
	}
	
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		System.out.println(map.put("3", "One"));
		System.out.println(map.put("2", "Two"));
		System.out.println(map.put("4", "Three"));
		System.out.println(map);
		
		/*HashSet<String> set = new HashSet<>();
		System.out.println(set.add("1"));
		System.out.println(set.add("2"));
		System.out.println(set);
		System.out.println(set.contains(null));
		
		HashMap<Sushant, String> mapS = new HashMap<>();
		Sushant s = new Sushant();
		System.out.println(mapS.put(s, "One"));
		System.out.println(mapS.put(s, "Two"));
		System.out.println(mapS);
		
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.add(null));
		System.out.println(list.add(null));
		System.out.println(list.size());
		System.out.println(list.get(0));*/
	}
}
