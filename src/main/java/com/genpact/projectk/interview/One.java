package com.genpact.projectk.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class One {
	
	public static void main(String[] args) {
		int[] arr= {3,5,67,2,56,89,90,12};
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		int n=1;
		var lo=list.stream()
		.sorted(Comparator.reverseOrder())
		.skip(n-1).findFirst().get();
		System.out.println(lo);
	}

}
