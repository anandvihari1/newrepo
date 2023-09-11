package com.genpact.projectk.coding.prep;

import java.util.HashMap;
import java.util.Objects;

public class CharacterRange {
	public static void main(String[] args) {
		char c='A';
		HashMap<String,Integer> h=new HashMap<>();
		h.put("Anand", null);
		h.put("Anand", null);
		System.out.println(h.size());
		HashMap<Student33,Integer> stu=new HashMap<>();
		stu.put(new Student33(1820,"Anand"), null);
		stu.put(new Student33(1820,"Anand"), null);
		System.out.println(stu.size());
		String s1=new String("Genpact");
		String s2="Genpact";
		String s3=new String("Genpact");
		String s4="Genpact";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		String s5=s4;
		s5.toUpperCase();
		System.out.println(s5);
		System.out.println(s4);
		Student33 p=new M();
	}

}
class Student33{
	Integer id;
	String name;
	public Student33(Integer id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Student33 stu=(Student33) obj;
		return Objects.equals(id, stu.id) && Objects.equals(stu.name, name);
	}
	public Student33(){
		System.out.println("Parent");
	}
}
class M extends Student33{
	public M() {
		System.out.println("Child");
	}
}
