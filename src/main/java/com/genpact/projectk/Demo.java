package com.genpact.projectk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	public static void main(String args[]) {
		System.out.println("Core java abstract class interface concrete class");
		String s1="Genpact";
		String s2=new String("Genpact");
		String s3=new String("Genpact");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		List<String> list=Arrays.asList("Anand","Kumar gouda","veeru","jay","j");
		var str=list.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
		System.out.println(str);
	}

}
