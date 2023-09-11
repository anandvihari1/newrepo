package com.genpact.projectk.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDecrease {
	public static void main(String[] args) {
		String s=new String("Java is programming language");
		Map<Character,Integer> map=new HashMap<>();
		char[] c=s.toCharArray();
		for(char ch:c) {
			if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		System.out.println(map);
		List<Map.Entry<Character, Integer>> list=new ArrayList<>(map.entrySet());
		//sort map using comparator
		/*Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Map.Entry<Character, Integer> o1,Map.Entry<Character, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
		System.out.println("after sorting "+list);*/
		
		//streams lambda
		/*
		 * Collections.sort(list, (o1,o2)->o2.getValue()-o1.getValue());
		 * System.out.println("after sorting "+list);
		 */
		
		//by using java 8 steams
		var sortedMap=map.entrySet()
		.stream()
//		.sorted(Map.Entry.comparingByKey())
		.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
		System.out.println(sortedMap);
	}

}
