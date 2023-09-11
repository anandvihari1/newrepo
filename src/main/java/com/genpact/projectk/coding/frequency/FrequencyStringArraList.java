package com.genpact.projectk.coding.frequency;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyStringArraList {
	public static void main(String[] args) {
		String s=new String("Java Is A Programming");
		String s2="Java Is A Programming";
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		Character ch[]=s.chars().mapToObj(c->(char) c).toArray(Character[] ::new);
		Map<Character,Integer> map=new HashMap<>();
		Stream.of(ch)
		.filter(c->c!=' ')
		.forEach(c->{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		});
		System.out.println(map);
		var sortedDesc=map.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
		System.out.println(sortedDesc);
	}

}
