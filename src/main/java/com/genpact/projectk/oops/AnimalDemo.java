package com.genpact.projectk.oops;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal dog=new Dog();
		AnimalTrainer at=new AnimalTrainer();
		at.train(dog);
	}

}

interface Animal{
	default void canMove() {
		System.out.println("Interface default () animals can move");
	}
	void canEat();
	static void canSwim() {
		System.out.println("intercae animal static () can swimm");
	}
}


interface TerrestialAnimal extends Animal { 
	abstract void canDrink();
	abstract void canLivesIn();
 }

interface AquaticAnimal extends Animal { 
	abstract void canLivesIn();
 }



class Dog implements Animal{
	public void canDrink() {
		System.out.println("concrete class Dog can drink");
	}

	@Override
	public void canEat() {
		System.out.println("concrete dog class - dog can eat");
		
	}
	public void bark() {
		System.out.println("concrete dog class - dog can bark");
	}
	
}
class Frog implements AquaticAnimal,TerrestialAnimal {

	@Override
	public void canEat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canDrink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canLivesIn() {
		// TODO Auto-generated method stub
		
	}
}

class AnimalTrainer{
	void train(Frog frog) {
		
	}
	void train(Dog dog) {
		
	}
	void train(Animal animal) {
		animal.canEat();
		animal.canMove();
		if (animal instanceof Dog)
		((Dog) animal).bark();
	}
}
