package com.genpact.projectk.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateString {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Anand","kumar","veera shankar","Anand","vinod","rama","rama");
		Set<String> set=new HashSet<>(list);
		System.out.println("unique values "+set);
		
		List<String> unique=new ArrayList<>();
		List<String> duplicate=new ArrayList<>();
		for(String s:list) {
			if(!unique.contains(s))
				unique.add(s);
			else
				duplicate.add(s);
		}
		System.out.println("unique "+unique);
		System.out.println("duplciaate "+duplicate);
		
		//remove duplicate from list java 8 streams
		List<String> uniq=list.stream().distinct().toList();
		System.out.println(uniq.toString());
	}

}
