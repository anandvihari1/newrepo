package com.genpact.projectk.java8.functional;

import java.util.function.Predicate;

public class PredicateDemo {
		public static void main(String[] args) {
			Predicate<Integer> p=new Predicate<Integer>() {

				@Override
				public boolean test(Integer t) {
					if(t<0)
					return false;
					else
						return true;
				}};
				System.out.println(p.test(-2));
				p=(x)->{
					if(x>0) {
						return true;
					}
					else 
						return false;
				};
				System.out.println(p.test(9));
		}
}
