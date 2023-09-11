package com.genpact.projectk.interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<String> l=new HashSet<>();
		l.add("Java");
		l.add("Java");
		l.add("Pythod");
		
		//ListIterator 
		Iterator i=l.iterator();
		while(i.hasNext()) {
			if(i.next().equals("Pythod"))
			i.remove();
			//System.out.println(i.next());
		}
		
		l.stream().forEach(System.out::print);
		System.out.println(l.size());
	}

}
