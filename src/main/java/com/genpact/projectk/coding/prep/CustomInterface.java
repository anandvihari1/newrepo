package com.genpact.projectk.coding.prep;

import java.util.function.Consumer;

public class CustomInterface {

	public static void main(String[] args) {
		DoubleNumber1<Integer> d=new DoubleNumber1<Integer>(){

			@Override
			public void doubleNumber(Integer num) {
				// TODO Auto-generated method stub
				System.out.println(num*num);
			}
			
		};
		d.doubleNumber(10);
	}
}

@FunctionalInterface
interface DoubleNumber1<Integer>{
	public void doubleNumber(Integer num);
}
