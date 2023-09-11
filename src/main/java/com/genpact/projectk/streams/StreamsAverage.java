package com.genpact.projectk.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class StreamsAverage {
	public static void main(String[] args) {
		List<Student11> list=new ArrayList<>();
		list.add(new Student11(1820,"Anand",27));
		list.add(new Student11(1520,"kumar",25));
		list.add(new Student11(1220,"sangeetha",24));
		list.add(new Student11(1720,"varma",30));
		var avg=list.stream().collect(Collectors.minBy(Comparator.comparing(Student11::getAge)));
//		.map(m->m.age)
			
		//.collect(Collectors.averagingInt(s->s.age));
		//.mapToInt(x->x)
//		.average();
		System.out.println("average "+avg.toString());
	}

}
class Student11{
	Integer id;
	String name;
	Integer age;
	public Student11(Integer id,String name,Integer age) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student11 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}