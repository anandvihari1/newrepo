package com.genpact.projectk.coding.immutability;

public class SwallowCOPYDEEPCOPY {
public static void main(String[] args) throws CloneNotSupportedException {
	SwallowDemo obj=new SwallowDemo();
	SwallowDemo obj2=obj;
	
	obj2.id=150;
	System.out.println(obj);
	System.out.println(obj.clone());
	
}
}
class SwallowDemo implements Cloneable{
	Integer id=30;

	@Override
	public String toString() {
		return "SwallowDemo [id=" + id + "]";
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
