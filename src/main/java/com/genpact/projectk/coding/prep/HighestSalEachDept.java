package com.genpact.projectk.coding.prep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalEachDept {
	public static void main(String[] args) {
		List<Empl> list=Arrays.asList(
				new Empl(1820,"Anand",26,"Male","Dev",100000),
				new Empl(1320,"Akhil",26,"Male","Testing",600000),
				new Empl(2820,"Mamatha",24,"FeMale","Dev",200000),
				new Empl(4120,"Sruthi",25,"FeMale","Testing",400000),
				new Empl(2120,"Amala",25,"FeMale","Testing",800000)
				);
		//Sort by Comparator
		Collections.sort(list, new Comparator<Empl>() {

			@Override
			public int compare(Empl e1, Empl e2) {
				return e1.name.compareTo(e2.name);
			}
		});
		System.out.println(list);
		
		//sort by lambda
		var sortByAge=list.stream()
		.sorted(Comparator.comparing(Empl::getAge).reversed())
		.toList();
		System.out.println(sortByAge);
		
		//sort based on age then name
		var sortByAgeThenName=list.stream()
				.sorted(Comparator.comparing(Empl::getAge).thenComparing(Empl::getName).reversed())
				.toList();
		System.out.println(sortByAgeThenName);
		
		//highest salary
		var hs=list.stream()
		.max(Comparator.comparing(Empl::getSal).reversed()).get();
		System.out.println(hs);
		
		//highest salary each dept
	Map<String,Empl> highestSalByDept=	list.stream()
		.collect(Collectors.groupingBy(Empl::getDept, 
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Empl::getSal)), Optional::get)));
	System.out.println(highestSalByDept);
	
	//min sal emp each dept
	Map<String,Empl> lowsaleachDept=list.stream()
	.collect(Collectors.groupingBy(Empl::getDept,
			Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Empl::getSal)), Optional::get)));
	System.out.println(lowsaleachDept);
	
	//highest salary each dept name
	var dept=list.stream()
	.collect(Collectors.groupingBy(Empl::getDept,
			Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Empl::getSal)), Optional::get)))
	.entrySet()
	.stream()
	.collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue().name));
	System.out.println(dept);
	
	//lowest salary from each dept deptname with empname
	
	var lowdept=list.stream()
	.collect(Collectors.groupingBy(Empl::getDept,
			Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Empl::getSal)), Optional::get)))
	.entrySet()
	.stream()
	.collect(Collectors.toMap(e->e.getKey(), e->e.getValue().name));
	System.out.println(lowdept);
	
	}

}
class Empl{
	Integer id;
	String name;
	Integer age;
	String gender;
	String dept;
	Integer sal;
	public Empl(Integer id,String name,Integer age,String gender,String dept,Integer sal) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.dept=dept;
		this.sal=sal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id,name,age,gender,dept,sal);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		if(getClass()!=obj.getClass())
			return false;
		Empl emp=(Empl) obj;
		return Objects.equals(emp.id, id) && Objects.equals(emp.name, name)&& Objects.equals(emp.age, age)
				&& Objects.equals(emp.gender, gender) && Objects.equals(emp.dept, dept) && Objects.equals(emp.sal, sal);
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept + ", sal="
				+ sal + "]";
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	
}
