package com.genpact.projectk.string;

public class SCPDemo {
	public static void main(String[] args) {
		/*
		 * String s="Java"; String s2="Java";
		 */
		String s3=new String("Java");
		String s2=new String("Java");
		String s="Java";
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
