package com.genpact.projectk.java8;

public class DefaultDemo {

	public static void main(String[] args) {
		new Animal() {

			@Override
			public void breath(int oxygen) {
				System.out.println("Animal can breath"+oxygen);
				
			}}.breath(8);
			
			Animal a1=(a)->{System.out.println("Animal can breath"+a);};
			a1.breath(9);
	}
}

interface Animal{
	public void breath(int oxygen);
}

