package com.genpact.projectk.interview;

public class Two implements A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.m1(0);
		A.m1();
	}

	@Override
	public void m1(String s) {
		// TODO Auto-generated method stub
		
	}

}
interface A{
	 static void m1() {
		 System.out.println("static m1() scured definition");
	 }
	 default void m1(int a) {
		 System.out.println("default method orriden can happend");
	 }
	 void m1(String s);
}
class B implements A{

	@Override
	public void m1(String s) {
		// TODO Auto-generated method stub
		
	}
	
}
