package com.genpact.projectk.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyStream {
public static void main(String[] args) {
	List<String> list=Arrays.asList("Anand","Sankar","Anand","kumar","kumar","Ravi");
	// frequency by tradional way
	Map<String,Integer> map=new HashMap<>();
	for(String s:list) {
		if(map.containsKey(s))
			map.put(s, map.get(s)+1);
		else
			map.put(s, 1);
	}
	System.out.println(map);
	//frequency by using streams
	Map<String, Long> mp=list.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(mp);
}
}
