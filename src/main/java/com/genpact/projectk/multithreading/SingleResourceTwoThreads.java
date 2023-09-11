package com.genpact.projectk.multithreading;

public class SingleResourceTwoThreads {
		public static void main(String[] args) {
			Table table=new Table();
			Thread11 t11=new Thread11(table);
			t11.start();
			
			Thread55 t55=new Thread55(table);
			t55.start();
		}
}

class Table{
	public void printTable(int n) {
		synchronized(this) {
		for(int i=1;i<11;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
}
		System.out.println("After table");
	}
	
}

class Thread11 extends Thread{
	
	Table table;
	public Thread11(Table t) {
		this.table=t;
	}
	@Override
	public void run() {
		try {
			table.printTable(3);
		Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Thread55 extends Thread{
	Table table;
	public Thread55(Table t) {
		this.table=t;
	}
	@Override
	public void run(){
	try {
		table.printTable(5);
		Thread.sleep(3000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}}
}