package com.genpact.projectk.streams;

import java.util.List;
import java.util.Optional;

public class OptionalDemo {
		public static void main(String[] args) throws Exception {
			Optional<String> ops=Optional.empty();
			Optional<String> ops1=Optional.of("d");
			Optional<String> ops2=Optional.ofNullable(null);
			ops1.ifPresent(x->System.out.println(x));
			//ops2.orElseThrow(()->new Exception("can be null or empty"));
			String s="Anand";
			if(Optional.ofNullable(s).isPresent())
			System.out.println(s.length());
			
			List<Integer> list=null;
			
			if(Optional.ofNullable(list.get(2)).isPresent())
				System.out.println("List has values");
		}
}
