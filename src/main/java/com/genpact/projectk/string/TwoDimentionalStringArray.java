package com.genpact.projectk.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoDimentionalStringArray {
	public static void main(String[] args) {
		String[][] arr=new String[][] {{"a","b"},{"c","d"},{"e","f"}};
		List<String> list=Arrays.stream(arr)
		.flatMap(f->Arrays.stream(f)).toList();
		System.out.println("list"+list);
	}

}
