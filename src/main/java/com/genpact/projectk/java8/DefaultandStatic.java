package com.genpact.projectk.java8;

public class DefaultandStatic {
		public static void main(String[] args) {
			Animal1 a=new Dog();
			a.eat();
			a.drink();
			Animal1.swim();
		}
}

interface Animal1{
	public void eat();
	public default void drink() {
		System.out.println("All animals can drink");
	}
	public static void swim() {
		System.out.println("All animals can swimm");
	}
}

class Dog implements Animal1{
	@Override
	public void eat() {
		System.out.println("Concreate class Dog can eat");
	}
	
	@Override
	public void drink() {
		System.out.println("Dogs can lick ");
	}
	/*
	 * @Override public void swim() {
	 * System.out.println("concrte class dog static override"); }
	 */
}