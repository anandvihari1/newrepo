package com.genpact.projectk.string;

public class ReverseString {
public static void main(String[] args) {
	String s=new String("Anand");
	StringBuffer sb=new StringBuffer();
	for(int i=s.length()-1;i>=0;i--) {
		sb.append(s.charAt(i));
	}
	System.out.println(sb);
}
}
