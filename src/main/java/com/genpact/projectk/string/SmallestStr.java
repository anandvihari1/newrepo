package com.genpact.projectk.string;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.comparator.Comparators;

public class SmallestStr {
	public static void main(String[] args) {
		String s="Java is a programming language Job Jaa";
		String ar[]=s.split(" ");
	Optional<String> smal=	Stream.of(ar).max(Comparator.comparing(String::length));
	if(smal.isPresent()){
		System.out.println(smal.get());
	}
	
	var list=Stream.of(ar)
			.filter(f->f.startsWith("J"))
			.sorted()
			.collect(Collectors.toList());
			//.sorted(Comparator.comparing(String::length))
			//.collect(Collectors.toList()));
	System.out.println(list);
	}

}
