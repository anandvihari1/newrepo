package com.genpact.projectk.coding.prep;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramDemo {
	public static void main(String[] args) {
		String str1="Jeepp";
		String str2="Peej";
		String strr1=str1.toLowerCase();
		String strr2=str2.toLowerCase();
		char[] ch1=strr1.toCharArray();
		char[] ch2=strr2.toCharArray();
		Character[] tch1=strr1.chars().mapToObj(c->(char)c).toArray(Character[]::new);
		Character[] tch2=strr2.chars().mapToObj(c->(char)c).toArray(Character[]::new);
		var m1=Stream.of(tch1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		var m2=Stream.of(tch2).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(m1+" "+m2);
		if(m1.equals(m2))
			System.out.println("Anagram====");
		else
			System.out.println("Not anaggram=====");
		//Character[] tch2=strr2.chars().mapToObj(c->(char)c).toArray(Character[]::new);
		boolean isAnagram=false;
		if(ch1.length==ch2.length) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.out.println(ch1);
			System.out.println(ch2);
			if(Arrays.equals(ch1, ch2))
				System.out.println("Anagram");
			else
				System.out.println("Not anagram");
		}
		else
			System.out.println("Not anagram");
		TreeSet<Character> t1=new TreeSet<>();
		TreeSet<Character> t2=new TreeSet<>();
		for(Character c:tch1)
		t1.add(c);
		for(Character c:tch2)
		t2.add(c);
//		sysout
		System.out.println(t1);
		if(Objects.equals(t1, t2))
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}

}
