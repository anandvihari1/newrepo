package com.genpact.projectk;

public class DefaultMultipleInterface {
	public static void main(String[] args) {
		Frog frog=new Frog();
		frog.canBreath();
		Frog.canHaveWings();
		AcquaticAnimals.canHaveWings();
	}

}

interface TerrestiolAnimals{
	public default void canBreath() {
		System.out.println("interface TerrestionAnimal can breath");
	}
	
}

interface AcquaticAnimals{
	default public void canBreath() {
		System.out.println("interface Aquatic animals can breath");
	}
	static public  void canHaveWings(){
		System.out.println("static () interfafce acquatic can have wings");
	}
}

class Frog implements TerrestiolAnimals, AcquaticAnimals{

	@Override
	public void canBreath() {
		
		AcquaticAnimals.super.canBreath();
	}
	static public  void canHaveWings(){
		System.out.println("static () Frog acquatic can have wings");
	}
	
}