package com.genpact.projectk.coding.prep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestSalary {
	public static void main(String[] args) {
		List<Emp12> list=Arrays.asList(new Emp12(1820,"Anand",10000,"Male","Dev"),
				new Emp12(1000,"Rajesh",200000,"Male","Test"),
				new Emp12(1500,"Madavi",250000,"Female","Dev"));
		var emplist=list.stream()
		.filter(f->f.sal>50000)
		.collect(Collectors.toList());
		System.out.println(emplist);
		//min salary
	Optional<Emp12> lowEmp=	list.stream()
		.min(Comparator.comparing(Emp12::getSal));
	if(lowEmp.isPresent()) {
		System.out.println(lowEmp);
	}
	
	var ratio=list.stream()
	.collect(Collectors.groupingBy(Emp12::getGender,Collectors.counting()));
	System.out.println(ratio);
	
	//var low=list.stream()
//	.sorted(Comparator.comparing(Emp12::getSal))
	//.collect(Collectors.groupingBy(Emp12::getDept,Collectors.collectingAndThen(Collect, null)));
	//System.out.println(low);
	var hs=list.stream()
			.sorted(Comparator.comparing(Emp12::getSal).reversed())
			.skip(1)
			.findFirst().get();
//	.max(Comparator.comparing(Emp12::getSal));
	System.out.println(hs);
	
	List<Integer> arrlist=Arrays.asList(2,3,1,8);
	var sec=arrlist.stream()
	.sorted(Comparator.comparing(Integer::intValue).reversed())
	.skip(1)
	.findFirst().get();
	System.out.println(sec);
	}
	
	

}
class Emp12{
	Integer id;
	String name;
	Integer sal;
	String gender;
	String dept;
	public Emp12(Integer id,String name,Integer sal,String gender,String dept) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.gender=gender;
		this.dept=dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp12 [id=" + id + ", name=" + name + ", sal=" + sal + ", gender=" + gender + ", dept=" + dept + "]";
	}
	
	
}
