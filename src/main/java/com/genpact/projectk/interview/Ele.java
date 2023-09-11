package com.genpact.projectk.interview;

public class Ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wait thread to comples
		
		Thread t1=new Thread(new Thread1());
		Thread t2=new Thread(new Thread2());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			System.out.println("THread interruped");
		}
		
		//emp id name salary second highest (n-1)
		// select * from emp e order by salary DESC LIMIT(1),1;
		//select max(e.salary) * from emp e where e.name not in(select e2.name from  emp e2 where max(e2.salary))
		
	}

}

class Thread1 implements Runnable{

	@Override
	public void run() {
		
		for(int i=5;i>=0;i--) {
			System.out.println(i);
		}
		
	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		
	}
	
}
