package com.genpact.projectk.streams;

import java.util.Arrays;
import java.util.List;

public class StreamMapDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,5,6,78,9);
		var newList=list.stream()
				.filter(f->f>5)
		.map(m->{
				return m*m;
		})
		.toList();
		System.out.println(newList);
	}

}
