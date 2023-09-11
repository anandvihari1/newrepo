package com.genpact.projectk.coding.immutability;

public class SwallowANDDeepCloning {
public static void main(String[] args) throws CloneNotSupportedException {
	Address4 add=new Address4();
	add.hno=191;
	Student4 obj=new Student4(1820,"Anand",add);
	//Swallow Copy
	/*
	 * Student4 swallow=obj; swallow.setId(1900); System.out.println(obj);
	 */
	//Deep Copy
	
	//super.clone() supports swallow copy
	Student4 clone=(Student4) obj.clone();
	clone.setId(170);
	System.out.println(obj);
	System.out.println(clone);
}
}
class Student4 implements Cloneable{
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	private Integer id;
	private String name;
	private Address4 address;
	public Student4(Integer id,String name,Address4 address) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public Address4 getAddress() {
		return address;
	}

	public void setAddress(Address4 address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student4 [id=" + id + ", name=" + name + "]";
	}
	
}
class Address4 implements Cloneable{
	Integer hno;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@Override
	public String toString() {
		return "Address4 [hno=" + hno + "]";
	}
	public Integer getHno() {
		return hno;
	}
	public void setHno(Integer hno) {
		this.hno = hno;
	}
}
