package com.genpact.projectk.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByStream {
	public static void main(String[] args) {
		Student11 s1=new Student11(11, "Anand", 26);
		Student11 s2=new Student11(13, "kumar", 22);
		Student11 s3=new Student11(17, "Anand varma", 22);
		List<Student11> list=List.of(s1,s2,s3);
		var groupByDept=list.stream()
				.map(map->map.age)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(groupByDept);
		
		String s="Java is programming lanague";
		Character ch[]=s.chars().mapToObj(c->(char)c).toArray(Character[]::new);
		var strcount=Stream.of(ch)
				.filter(c-> c.charValue()!=' ')
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(strcount);
	}

}
