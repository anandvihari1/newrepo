package com.genpact.projectk.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.genpact.projectk.comparator.Student;

public class SecondHighestSalaryFromEachDept {
public static void main(String[] args) {
	Student s1=new Student(1820,"Anand",27,120000,"IT");
	Student s2=new Student(120,"Kumar",26,20000,"Dev");
	Student s3=new Student(1720,"Varma",25,70000,"Testing");
	Student s4=new Student(1320,"Sharma",25,90000,"Dev");
	Student s5=new Student(1120,"Rekha",26,120000,"IT");
	Student s6=new Student(1203,"Surekha",30,20000,"Dev");
	Student s7=new Student(1620,"Vani",24,70000,"Testing");
	Student s8=new Student(1325,"Janani",23,90000,"Dev");
	
	List<Student> list=Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8);
	//Comparator
	/*Collections.sort(list, new Comparator<Student>() {
		@Override
		public int compare(Student s1,Student s2) {
			return s2.getSalary().compareTo(s1.getSalary());
			
		}
	});
	System.out.println("ananomus class sorted"+list); */
	
	//lambda expression
	var descsalary=list.stream()
	.sorted(Comparator.comparing(Student::getSalary).reversed()).toList();
	System.out.println(descsalary.get(2));
	
	//method reference
	Optional<Student> second=list.stream()
	.sorted(Collections.reverseOrder(Comparator.comparing(Student::getSalary)))
	.skip(1)
	.findFirst();
	System.out.println(second);
	
	//if salry is same sort based on age
	var f=list.stream()
	.sorted(Collections.reverseOrder(Comparator.comparing(Student::getSalary)
			.thenComparing(Comparator.comparing(Student::getAge))))
	.skip(0)
	.findFirst();
	System.out.println(f);
}
}
