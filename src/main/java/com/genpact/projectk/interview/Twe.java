package com.genpact.projectk.interview;

public class Twe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aa";
		System.out.println(s.repeat(2));
		String sb=new StringBuilder(s).reverse().toString();
		if(s.equals(sb))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		boolean palindrome=false;
		for(int i=s.length();i>=0;i--) {
		}

	}

}
