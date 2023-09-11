package com.genpact.projectk.coding.frequency;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedNumbers {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,2,4,3,6,8,6);
	Map<Integer,Integer> map=new HashMap<>();
	list.stream()
	.forEach(n->{
		if(map.containsKey(n))
			map.put(n, map.get(n)+1);
		else
			map.put(n, 1);
	});
	var nonrepeated=map.entrySet()
	.stream()
	.filter(f->f.getValue()<2)
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
	nonrepeated.entrySet().stream().forEach(m->System.out.print(m.getKey()));
	
	//grouping by Function.identity Collectors.count()
	var nonRep=list.stream()
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.entrySet().stream()
	.filter(f->f.getValue()==1)
	.map(Map.Entry::getKey)
	.toList();
	System.out.println(nonRep);
}
}
