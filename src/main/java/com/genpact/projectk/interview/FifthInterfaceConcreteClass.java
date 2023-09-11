package com.genpact.projectk.interview;

public class FifthInterfaceConcreteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new AnandCar();
		car.breaks();
		Car.wheels();
		car.engine();
	}

}
interface Car{
	static void wheels() {
		System.out.println("Car should have four wheels//secured definition");
	}
	default void engine() {
		System.out.println("Added General engine");
	}
	void breaks();
}
class BMW implements Car{

	@Override
	public void breaks() {
		System.out.println("BMW Added breaks");
		
	}
	
	@Override
	public void engine() {
		System.out.println("BMW added BMW Engine");
	}
	
	
}

class AnandCar extends BMW{
	
}
