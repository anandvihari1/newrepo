package com.genpact.projectk.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringLengthlessthan5 {
public static void main(String[] args) {
	List<String> list=Arrays.asList("Genpact","Gold Man sacchs","Morgan stanley","GE");
	var sortedlist=list.stream()
	.filter(s->s.length()>5)
	.sorted(Comparator.comparing(String::length))
	.toList();
	System.out.println(sortedlist);
}
}
