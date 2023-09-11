package com.genpact.projectk.comparator;
import java.util.*;
import java.util.stream.Collectors;
public class ComparatorDemo {
	public static void main(String[] args) {
		Student s1=new Student(1820,"anand",27,1,"IT");
		Student s2=new Student(820,"zola",26,2,"Testing");
		Student s3=new Student(120,"anand varma",25,3,"IT");
		Student s4=new Student(520,"anand SHARMA",23,4,"Management");
		List<Student> list=new ArrayList<>();
		list.add(s3);
		list.add(s2);
		list.add(s1);
		list.add(s4);
		//By using single attribute Comparator
		//Collections.sort(list, new ComparatorByName());
		//By using single attribute Comparator
//		Collections.sort(list, new ComparatorSortbyId());
		////By using double attribute Comparator
		//Collections.sort(list, new ComparatorByNameandId());
		
		//By using java 8 lambda expression with single attribute
		//Collections.sort(list, (std1,std2)-> std1.getName().compareTo(std2.getName()));
		
		//By using java 8 method reference
		//Collections.sort(list, Comparator.comparing(Student::getName));
		
		//By using java 8 two method reference
		//Collections.sort(list, Comparator.comparing(Student::getName).thenComparing(Comparator.comparing(Student::getId)));
		
		// java 8 desending order
		List<Student> sortedList=list
								.stream()
								.filter(s->s.getId()<1820)
								.sorted(Comparator.comparing(Student::getName).thenComparing(Comparator.comparing(Student::getId).reversed()))
								.collect(Collectors.toList());
		
		sortedList.stream().forEach(x->System.out.println(x));
	}

}
