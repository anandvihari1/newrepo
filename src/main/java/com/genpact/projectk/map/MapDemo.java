package com.genpact.projectk.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("veera simha reddy","And","Kumar","veera shankar");
		//By using streams
		List<String> sortedList=list.stream()
		.sorted(Comparator.comparing(String::length).reversed())
		.toList();
		//sortedList.stream().forEach(System.out::println);
		
		//Tradional or Map remove duplicates
		Map<String,Integer> map=new HashMap<>();
		for(String s:list) {
			if(!(map.containsKey(s))) {
				map.put(s, s.length());
			}
		}
		System.out.println(map);
		//How to convert map to list
		// Create a list from elements of HashMap then tradional way
        List<Map.Entry<String, Integer>> list1=new ArrayList<>(map.entrySet());
        /*Collections.sort(list1,new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String,Integer> o1, Entry<String,Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue()-o2.getValue();
			}
        	
        });*/
        
        //Convert list of map to map
       HashMap<String,Integer> map1=new HashMap<>();
       for(Map.Entry<String,Integer> mp:list1) {
    	   map1.put(mp.getKey(), mp.getValue());
       }
       System.out.println("map from list of map"+map1);
        //Sort map by value using java 8 streams
      /* List<Map.Entry<String, Integer>> sortedmap=map1.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        //.sorted(Map.Entry.comparingByKey().reversed())
        .toList();// to list
        System.out.println(sortedmap); */
       
       //sort by value using java 8 convert to sorted map
   /*    Map<String,Integer> sortedMap=new HashMap<>();
       sortedMap= map1.entrySet()
       .stream()
       .sorted(Map.Entry.comparingByValue())
       .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
       System.out.println("sorted map"+sortedMap);*/
       
       //sort map by value decreasing order
       Map<String,Integer> sortedMap=map1.entrySet()
    		   .stream()
    		   .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
    		   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
       System.out.println("decreasing order of map"+sortedMap);
	}

}

