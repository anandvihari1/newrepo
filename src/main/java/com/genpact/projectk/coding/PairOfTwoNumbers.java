package com.genpact.projectk.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PairOfTwoNumbers {
	public static void main(String[] args) {
		int[] list= new int[] {2,3,4,5,6,12,9};
		Integer num=8;
		for(Integer i:list) {
			Integer diff=num-i;
			var o=IntStream.of(list).boxed()
			.filter(f->f==diff)
			.collect(Collectors.toList());
			System.out.println(o);
		}
	}

}
