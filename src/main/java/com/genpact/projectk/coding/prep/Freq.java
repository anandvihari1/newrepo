package com.genpact.projectk.coding.prep;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Freq {
	public static void main(String[] args) {
		String s="This is Java , I learn Java";
		String str[]=s.split(" ");
		Map<String,Long> count=Arrays.asList(str)
		.stream()
		//Map<String,Long> count=Stream
		//.of(str)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(count);
	}

}
