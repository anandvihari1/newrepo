package com.genpact.projectk.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableWrapperDemo {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("zomato");
	list.add("swiggy");
	list.add("uber");
	list.add("rapido");
	Comparator<String> compartor=new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	};
	Collections.sort(list,compartor);
	list.stream().forEach(x->System.out.println(x));
}
}
