package com.genpact.projectk.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAsyncExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		ThreadAsync tasyc=new ThreadAsync();
		Future<?> future=executorService.submit(tasyc); 
		try {
			future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class ThreadAsync implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread calls"+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
