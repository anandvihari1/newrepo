package com.genpact.projectk.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapUsingStreams {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(20, "Banana");
	map.put(60, "Apple");
	map.put(120, "graps");
	map.put(80, "kiwi");
	
	var list=map.entrySet()
	.stream()
	.filter(f->f.getKey()>50)
	.collect(Collectors.toList());
	System.out.println(list.get(0).getValue());
}
}
