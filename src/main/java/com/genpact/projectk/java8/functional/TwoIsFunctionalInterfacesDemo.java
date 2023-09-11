package com.genpact.projectk.java8.functional;

public class TwoIsFunctionalInterfacesDemo {

}

@FunctionalInterface
interface F1{
	public default void m1() {
		System.out.println();
	}
	public void m2();
	public static void m3() {
		System.out.println("first funcationl interface static");
	}
}
@FunctionalInterface
interface F2 extends F1{
	public static void m3() {
	}
	public default void m1() {
		System.out.println();
	}
	//public void m5();
}