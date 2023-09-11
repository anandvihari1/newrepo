package com.genpact.projectk.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorNatural {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,4,6,78,12,79,2);
		var min=list.stream()
//		.max(Comparator.comparing(Integer::intValue));
				.min(Comparator.comparing(Integer::intValue));
		System.out.println("ascednig"+min);
		
		//java 8 lambda
		List<String> list1=Arrays.asList("anand","kumar fvra","shankar goud","ravi");
		/*var sorted=list1.stream()
		.sorted((s1,s2)->s1.length()-s2.length())
		.toList();
		System.out.println("sorted"+sorted);*/
		
		//Comparator
		/*Collections.sort(list1, new Comparator<String>() {
			@Override
			public int compare(String s1,String s2) {
				return s1.length()-s2.length();
			}
		});
		System.out.println(list1);*/
		
		var sortedList=list1.stream()
		.sorted(Comparator.comparing(String::length).reversed()).toList();
		System.out.println(sortedList);
	}

}
