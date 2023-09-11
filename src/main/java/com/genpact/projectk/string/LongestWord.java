package com.genpact.projectk.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestWord {
	public static void main(String[] args) {
		String s="Java is a programming language";
		Character[] ch=s.chars().mapToObj(c->(char)c).toArray(Character[]::new);
		var map=Stream.of(ch)
		.filter(f->f!=' ')
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
		System.out.println(map);
		String ar[]=s.split(" ");
		Object o=new Object();
//		Predicate<String>
//		Stream.of(ar).anyMatch(p->p.length())
		Map<String,Integer> map1=new HashMap<>();
		Stream.of(ar)
		.map(m->{
			map1.put(m, ar.length);
			return map1;
		});
		Integer i=100;
		Integer k=10;
		System.out.println(i.hashCode());
		System.out.println(k.hashCode());
		String s10="Anand";
		String s11="Anand";
		System.out.println(s10.hashCode());
		System.out.println(s11.hashCode());
//		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
		//.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

}
