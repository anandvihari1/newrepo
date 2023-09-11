package com.genpact.projectk.coding;

import java.util.Arrays;
import java.util.List;

public class UniqueElemFromList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,3,4,23,65);
		var uniq=list.stream()
				.distinct().toList();
		uniq.stream().forEach(n->System.out.print(n+" "));
	}

}
