package com.genpact.projectk.coding.prep;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Nonduplicate {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,4,6,3,2,8);
		var nonRep=list.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(f->f.getValue()==1)
		.map(m->m.getKey())
		.toList();
		System.out.println(nonRep);
	}
Object d=new Object();

}
