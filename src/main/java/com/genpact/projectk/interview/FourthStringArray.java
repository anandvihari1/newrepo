package com.genpact.projectk.interview;

import java.util.stream.Stream;

public class FourthStringArray {
	public static void main(String[] args) {
		String ar[]= {"3","2","abc"};
		for(String s:ar) {
			if(Character.isDigit(s.charAt(0)))
				System.out.println(s);
		}
		Stream.of(ar)
		.forEach(str->{
			if(Character.isDigit(str.charAt(0)))
				System.out.println(str);
		});
		String s="AnaND padAMALA";
		String[] s2=s.split("");
		Stream.of(s2)
		.forEach(str->{
			if(Character.isLowerCase(str.charAt(0)))
				System.out.print(str);
			
		});
		char[] c=s.toCharArray();
		System.out.println();
		for(char i:c) {
			
			if(i>='A' && i<='Z') {
				System.out.println(i);
			}
		}
		
		
	}

}
