package com.genpact.projectk.multithreading;

public class ThreadClass extends Thread{
		public static void main(String[] args) {
			for(int i=0;i<100;i++) {
				System.out.println(i);
				if(i==5) {
					try {
						System.out.println("Executing main thread");
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			ChildThread.smallThread();
		}
}

class ChildThread{
	public static void smallThread() {
		ThreadClass t=new ThreadClass();
		t.start();
		for(int i=0;i<100;i++) {
			System.out.println(i);
			if(i==10) {
				try {
					System.out.println("Executing child thread");
					Thread.sleep(2000L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
