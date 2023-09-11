package com.genpact.projectk.coding.immutability;

public class ImmutabilityHasARelation {
	public static void main(String[] args) {
		Address2 add=new Address2(191, "Owk");
		Student2 stu=new Student2(1820, "Anand", add);
		System.out.println(stu);
		add.setVill("Banglore");
		System.out.println(stu);
		System.out.println(add.getVill());
	}
		
}

final class Student2 extends Parent{
	private final Integer id;
	private final String name;
	private final Address2 address;
	public Student2(Integer id,String name, Address2 address) {
		super();
		this.id=id;
		this.name=name;
		//Deep copy
		Address2 add=new Address2(address.getHno(), address.getVill());
		this.address=add;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	/*public Address2 getAddress() {
		return address;
	}*/
	public Address2 getAddress() throws CloneNotSupportedException{
		return (Address2) address.clone();
	}
	
}
class Address2 implements Cloneable{
	private Integer hno;
	private String vill;
	public Address2(Integer hno, String vill) {
		super();
		this.hno = hno;
		this.vill = vill;
	}
	public Integer getHno() {
		return hno;
	}
	public String getVill() {
		return vill;
	}
	public void setHno(Integer hno) {
		this.hno = hno;
	}
	public void setVill(String vill) {
		this.vill = vill;
	}
	@Override
	public String toString() {
		return "Address2 [hno=" + hno + ", vill=" + vill + "]";
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
class Parent{
	private String dadName;
	public Parent() {
		super();
		this.dadName=dadName;
	}
}
