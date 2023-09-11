package com.genpact.projectk.coding;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyDemo {
	public static void main(String[] args) {
		String s="Hello World";
		Character [] ch=s.chars().mapToObj(c->(char)c).toArray(Character []::new);
		var s1=Stream.of(ch)
			.filter(f->f!=' ')	
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream()
		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
		System.out.println("sorted "+ s1);
		
		
		Map<Character,Integer> map=new HashMap<>();
		for(Character c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		System.out.println(map);
		String str=null;
		Optional.ofNullable(str);
		Optional.ofNullable(str).ifPresent(x->System.out.print(x.length()));
	}

}
