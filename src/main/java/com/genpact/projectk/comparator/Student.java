package com.genpact.projectk.comparator;

import java.util.Comparator;
import java.util.Objects;

public class Student{
	private Integer id;
	private String name;
	private Integer salary;
	private String deptName;
	private Integer age;
	
	public Student(Integer id,String name,Integer age,Integer salary,String deptName) {
		super();
		this.id=id;
		this.name=name;
		this.deptName=deptName;
		this.salary=salary;
		this.age=age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(deptName, id, name, salary,age);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Student s=(Student) obj;
		return Objects.equals(id, s.id) && Objects.equals(name, s.name)
				&& Objects.equals(s.salary, salary)&&Objects.equals(s.deptName, deptName)
				&& Objects.equals(s.age, age);
	}

	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + ", deptName=" + deptName + ", age=" + age
				+ "]";
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

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
