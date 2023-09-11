package com.genpact.projectk.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.util.comparator.Comparators;

public class SevenDemo {

	public static void main(String[] args) {
		//Write a program to print the max salary of an employee from each department
		List<Emp12> list=Arrays.asList(new Emp12(10,"Anand",120000,"Test"),new Emp12(20,"Kumar",2000,"Dev"),
				new Emp12(30,"Moni",18000,"Test"));
		
	var l=	list.stream()
		//.sorted(Comparator.comparing(Emp12::getSalary).reversed())
		.collect(Collectors.groupingBy(Emp12::getDept,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Emp12::getSalary)), Optional::get)));
	System.out.println(l);
		/*
		 * Map<Integer,Emp12> map=new HashMap<>(); map.put(10, new
		 * Emp12(10,"Anand",12000,"Test")); map.put(20, new
		 * Emp12(20,"Kumar",2000,"Dev")); map.put(30, new
		 * Emp12(30,"Moni",18000,"Test")); map.entrySet() .stream()
		 * .sorted(Map.Entry.comparingByValue(Emp12::getSalary))
		 * .collect(Collectors.groupingBy(Function.identity(), Emp12::getDept))
		 */
		//Enter a string to generate its permutations: BELL
		//[LEBL, LLBE, ELBL, LELB, BELL, BLLE, LBLE, EBLL, ELLB, BLEL, LBEL, LLEB]
		
	}

}
class Emp12{
	private Integer id;
	private String name;
	private Integer salary;
	private String dept;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
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
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Emp12(Integer id, String name, Integer salary,String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept=dept;
	}
	@Override
	public String toString() {
		return "Emp12 [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
