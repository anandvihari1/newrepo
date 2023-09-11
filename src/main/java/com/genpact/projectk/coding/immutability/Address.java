package com.genpact.projectk.coding.immutability;

public class Address {
	String villageName;
	public Address(String v) {
		super();
		this.villageName=v;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	@Override
	public String toString() {
		return "Address [villageName=" + villageName + "]";
	}
	
}
