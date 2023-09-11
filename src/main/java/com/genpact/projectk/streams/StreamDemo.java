package com.genpact.projectk.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream<String> stream=Stream.of("Annd","kumar");
		stream.forEach(System.out::println);
		
//		int[] ar= {1,2,3,4,5};
		Integer it[]= {5,6};
		System.out.println(Stream.of(it).count());
	}

}
