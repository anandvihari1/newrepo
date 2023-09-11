package com.genpact.projectk.coding.immutability;

public class ImmutabilityIfCloneNotSupported {
public static void main(String[] args) {
	Address3 add=new Address3(191, "Owk");
	Student3 stu=new Student3(1820, "Anand", add);
	System.out.println(stu);
	add.setVillageName("Banglore");
	System.out.println(stu);
	System.out.println(add.getVillageName());
}
}

final class Student3{
	private final Integer id;
	private final String name;
	private final Address3 address;
	public Student3(Integer id,String name,Address3 address) {
		super();
		this.id=id;
		this.name=name;
		Address3 add=new Address3(address.getHno(), address.getVillageName());
		
		this.address=add;
	}
	
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address3 getAddress(){
		//Address3 add=new Address3(address.getHno(), address.getVillageName());
		return address;
	}
	
}
class Address3 implements Cloneable{
	private Integer hno;
	private String villageName;
	public Address3(Integer hno,String villageName) {
		this.hno=hno;
		this.villageName=villageName;
	}
	public Integer getHno() {
		return hno;
	}
	public void setHno(Integer hno) {
		this.hno = hno;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	@Override
	public String toString() {
		return "Address3 [hno=" + hno + ", villageName=" + villageName + "]";
	}
	public Object clone() throws CloneNotSupportedException{
		return  super.clone();
	}
	
}
