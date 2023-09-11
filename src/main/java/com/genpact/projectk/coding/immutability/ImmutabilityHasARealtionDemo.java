package com.genpact.projectk.coding.immutability;

import java.util.Date;
import java.util.Objects;

public class ImmutabilityHasARealtionDemo {
public static void main(String[] args) {
	
	Address5 add=new Address5(191,"Owk");
	Student5 stu=new Student5(1820,"Anand",add,new Date(06/03/2023));
	System.out.println(stu);
	add.setVillageName("Banglore");
	System.out.println(stu);
}
}
final class Student5{
	private final Integer id;
	private final String name;
	private final Date date;
	private final Address5 address;
	
	public Student5(Integer id,String name,Address5 address,Date date) {
		super();
		this.id=id;
		this.name=name;
		//Address5 add=new Address5(address.gethNo(),address.getVillageName());
		this.address=address;
		this.date=date;
	}
	public Date getDate() {
		return new Date(date.getTime());
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address5 getAddress() throws CloneNotSupportedException{
		return (Address5) address.clone();
	}
	@Override
	public String toString() {
		return "Student5 [id=" + id + ", name=" + name + ", date=" + date + ", address=" + address + "]";
	}
	
}

class Address5 implements Cloneable{
	private String villageName;
	private Integer hNo;
	public Address5(Integer hno,String name) {
		super();
		this.villageName=name;
		this.hNo=hno;
	}
	public String getVillageName() {
		return villageName;
	}
	public Integer gethNo() {
		return hNo;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public void sethNo(Integer hNo) {
		this.hNo = hNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hNo,villageName);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(null==obj)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Address5 add=(Address5) obj;
		return Objects.equals(hNo,add.gethNo()) && Objects.equals(villageName, add.villageName);
	}
	@Override
	public String toString() {
		return "Address5 [villageName=" + villageName + ", hNo=" + hNo + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}