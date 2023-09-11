package com.genpact.projectk.coding;

import java.util.HashSet;
import java.util.Objects;

public class EqualsAndHashCode {
	public static void main(String[] args) {
		//Student1 stu1=new Student1(1820,"Anand",27);
		//Student1 stu2=new Student1(1820,"Anand",27);
		
		/*
		 * System.out.println(stu1.hashCode()); System.out.println(stu2.hashCode());
		 * System.out.println(stu1.equals(null));
		 */
		HashSet<Student100> hashset=new HashSet<>();
		HashSet<String> hashstr=new HashSet<>();
		hashstr.add("Anand");
		hashstr.add("Anand");
		hashset.add(new Student100());
		hashset.add(new Student100());
		System.out.println(hashset.size());
		System.out.println(hashstr.size());
	}

}
class Student100{
	private Integer id;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private String name;
	private Integer age;
	
	/*public Student1(Integer id,String name,Integer age) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
	}*/
	
	/*@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(getClass()!=obj.getClass())
			return false;
		Student1 stu=(Student1) obj;
		return Objects.equals(stu.id, id) && Objects.equals(stu.name, name)&& Objects.equals(stu.age, age);
	}*/
}
