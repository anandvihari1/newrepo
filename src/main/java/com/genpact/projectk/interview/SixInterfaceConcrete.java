package com.genpact.projectk.interview;

public class SixInterfaceConcrete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Frog f=new Frog();
			f.eyes();
	}

}

interface LandAnimals{
	static void walk() {
		System.out.println("LandAnimals can walk with legs");
	}
	default void eyes() {
		System.out.println("land animals can have eyes");
	}
	void eat();
}
interface AcquaticAnimals{
	default void eyes() {
		System.out.println("Acquatic animals can have eyes");
	}
}
class Frog implements LandAnimals, AcquaticAnimals{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eyes() {
		// TODO Auto-generated method stub
		LandAnimals.super.eyes();
	}
	
}
