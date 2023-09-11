package com.genpact.projectk.coding.immutability;

public class ImmutabilityClass {
	public static void main(String[] args) {
		Address address=new Address("owk");
		StudentImmutability s=new StudentImmutability(10,"AnND",address);
		System.out.println(s);
		
		System.out.println(s.getAddress());
		address.setVillageName("Banglore");
		System.out.println(s);
		
	}

}
// final class
//final and private attributes
//no setters
//always make deep copy in the constructors
final class StudentImmutability{
	private  int id;
	private final String name;
	private final Address address;
	public StudentImmutability(int id,String name, Address address) {
		this.id=id;
		this.name=name;
		Address deepCopy=new Address(address.villageName);
		this.address=deepCopy;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "StudentImmutability [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
class Bike{
	String name;
	public Bike(String name) {
		this.name=name;
	}
}
