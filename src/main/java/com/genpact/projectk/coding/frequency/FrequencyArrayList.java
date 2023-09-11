package com.genpact.projectk.coding.frequency;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyArrayList {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,4,5,6,3,2,3,4,56,4);
	Map<Integer,Integer> map=new HashMap<>();
	/*for(Integer num:list) {
		if(map.containsKey(num))
			map.put(num, map.get(num)+1);
		else
			map.put(num, 1);
	}*/
	
	list.stream()
	.forEach(num->{
		if(map.containsKey(num))
			map.put(num, map.get(num)+1);
		else
			map.put(num, 1);
	});
	System.out.println(map);
	var sortedDesc=map.entrySet()
	.stream()
	.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
	System.out.println(sortedDesc);
}
}
