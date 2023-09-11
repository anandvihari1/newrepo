package com.genpact.projectk.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceDemo {
	public static void main(String[] args) {
		var total=Stream.of(3,5,6,67,9,97,54).reduce((sum,n)->sum+n);
		System.out.println(total);
		Student11 s1=new Student11(11, "Anand", 26);
		Student11 s2=new Student11(13, "kumar", 28);
		Student11 s3=new Student11(17, "Anand varma", 22);
		List<Student11> list=List.of(s1,s2,s3);
		System.out.println(list);
		//sum
		var toatlaAge=list.stream().collect(Collectors.summingInt(stu->stu.age));
		System.out.println(toatlaAge);
		var avgAge=list.stream().collect(Collectors.averagingInt(stu->stu.age));
		System.out.println(avgAge);
	}

}
