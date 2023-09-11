package com.genpact.projectk.internal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class InternalEvaluation {
	public static void main(String[] args) {
		//[5,8,2,3,24,43,11] - 2nd higest
		List<Integer> list=Arrays.asList(5,8,2,3,24,43,11);
		var secondHighest=list.stream()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.toList();
		System.out.println(secondHighest.get(0));
		
//		String str = "A..Za..z";
		String str = "A,B,C,D,E,F,G,H,I,J,K";
		Character[] ch=str.chars().mapToObj(c->(char)c).toArray(Character[]::new);
		//String arr[]=str.split(",");
		var nonvol=Stream.of(ch)
		.filter(f-> f!='A' && f!='E' && f!='I' && f!='O' &&f!='U' && f!=',')
//		.collect(Collectors.to)
		.toList();
		System.out.println(nonvol);
		meta phase
		desing behvor obverser reflection clone avoid
		List<List<Address>>
		solid
		string builder
		marker 
		== quals
		basic springboot
		
		
	}

}
