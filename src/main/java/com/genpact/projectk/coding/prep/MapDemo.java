package com.genpact.projectk.coding.prep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapDemo {
public static void main(String[] args) {
	List<Student> list=Arrays.asList(new Student(1820,"Anand kumar"),new Student(1400,"Charan"),new Student(1500,"Ramya"));
//	Map<Integer,String> map1=new HashMap<>(list);
	//map1.put(10, "G");
	//System.out.println(map1);
	var map=list.stream()
	.collect(Collectors.toMap(s->s.id, s->s.name));
	System.out.println(map);
	var k=list.stream()
	.map(m->m.name)
	.collect(Collectors.groupingBy(e->e,Collectors.counting()));
	System.out.println(k);
	var sum=IntStream.of(1,2,3,4,5).reduce((kk, p)->kk+p);
//	var sum=IntStream.of(1,2,3,4,5).reduce((kk, p)->kk+p);
	System.out.println(sum);
	var avg=list.stream().mapToInt(m->m.id).average().getAsDouble();
	var longestname=list.stream()
	.map(m->m.name)
	.max(Comparator.comparing(String::length)).get();
	System.out.println(avg);
	System.out.println(longestname);
}
}
class Student{
	Integer id;
	String name;
	public Student(Integer id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
}
