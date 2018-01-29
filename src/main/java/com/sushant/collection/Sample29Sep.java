package com.sushant.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sample29Sep {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		List<String> keyList = new ArrayList<>(map.keySet());
		List<Entry<String, String>> entryList = new ArrayList<>(map.entrySet());
		
		Map<String, Object> modifiableHashMap = new HashMap<String, Object>();
		Map<String, Object> unModifiableHashMap = Collections.unmodifiableMap(modifiableHashMap);
	}
}
