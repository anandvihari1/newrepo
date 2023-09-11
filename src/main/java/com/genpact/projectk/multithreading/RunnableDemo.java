package com.genpact.projectk.multithreading;

public class RunnableDemo {
	public static void main(String[] args) {
		System.out.println("Main thread");
		ChildThread1 runnableTh=new ChildThread1();
		Thread t=new Thread(runnableTh);
		t.start();
	}
}

class ChildThread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
