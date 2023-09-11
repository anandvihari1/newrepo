package com.genpact.projectk.coding.designpatterns;

import java.util.Objects;

import org.springframework.util.StringUtils;

public class FactoryDesignPattern {
	public static void main(String[] args) {
		String vehileName="Bike";
		String bikeBrandName="TVS - Apachie 160 4V";
		Vechicle bike=new VehicleFactory().manufactureVehicle(vehileName, bikeBrandName);
		System.out.println(bike);
		String vechileName1="Car";
		String carBrandName="TATA i10";
		Vechicle car=new VehicleFactory().manufactureVehicle(vechileName1, carBrandName);
		System.out.println(car);
	}

}
interface FactoryAbstraction{
	Vechicle manufactureVehicle(String vehicleName, String brandName);
}

class VehicleFactory implements FactoryAbstraction{

	@Override
	public Vechicle manufactureVehicle(String vehicleName, String brandName) {
		Vechicle vehicle = null;
		if(Objects.equals(vehicleName, "Bike")) {
			vehicle= new Bike(2,brandName);
			vehicle.addEngine();
		}
		if(Objects.equals(vehicleName, "Car")) {
			vehicle= new Car(4,brandName);
			vehicle.addEngine();
		}
		return vehicle;
	}
	
}
interface Vechicle{
	void addEngine();
}

class Bike implements Vechicle{
	int wheels;
	String name;
	public Bike( int wheels,String name) {
		super();
		this.wheels=wheels;
		this.name=name;
	}
	@Override
	public void addEngine() {
		System.out.println("Added bike engine");
		
	}
	@Override
	public String toString() {
		return "Bike [wheels=" + wheels + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(wheels,name);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		if(obj.getClass()!=getClass())
			return false;
		Bike bike=(Bike) obj;
		return Objects.equals(name, bike.name)&& Objects.equals(wheels, bike.wheels);
	}
}
class Car implements Vechicle{

	int wheels;
	String name;
	public Car(int wheels,String name) {
		this.wheels=wheels;
		this.name=name;
	}
	@Override
	public void addEngine() {
		// TODO Auto-generated method stub
		System.out.println("Car engine has been added");
	}
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(wheels,name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(this==obj)
			return true;
		if(obj.getClass()!=getClass())
			return false;
		Car car=(Car) obj;
		return Objects.equals(car.name, name) && Objects.equals(wheels,car.wheels);
	}
}

