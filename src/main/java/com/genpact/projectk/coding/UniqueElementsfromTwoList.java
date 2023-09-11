package com.genpact.projectk.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElementsfromTwoList {
public static void main(String[] args) {
	List<Integer>list1=Arrays.asList(3,5,7,8,94,32,1);
	List<Integer>list2=Arrays.asList(13,5,27,68,94,32,21,94);
	List<List<Integer>> list3=Arrays.asList(list1,list2);
	List<Integer> single=list3.stream()
	.flatMap(f->f.stream())
	.toList();
	var dist=single.stream().distinct().toList();
	//distinct values
	System.out.println(dist);
	
	//frequecny by map
	Map<Integer,Long> map=single.stream()
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	//sortby value decrease
	var sortedMap=map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()) )
			
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
	System.out.println(sortedMap);
	//duplicate values by frequecy
	var duplicateList=sortedMap.entrySet().stream()
	.filter(f->f.getValue()>1)
	.map(m->m.getKey()).toList();
	System.out.println(duplicateList);
	
	//By using java 8 streams
	//duplicate/common elements
	var dupList=list1.stream()
	.filter(f->list2.contains(f))
	.toList();
	System.out.println(dupList);
	
	//unique elements from both list
	
	
}
}
