package com.genpact.projectk.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrameworkDemo {
	public static void main(String[] args) {
		ExecutorService exeSrv=Executors.newFixedThreadPool(10);
	Future<String> fs=exeSrv.submit(new ExecutorA());
		Future<String> fs2=exeSrv.submit(new ExecutorB());
		try {
			System.out.println(fs.get());
			//fs.get();
			System.out.println(fs2.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class ExecutorA implements Callable<String>
{

	@Override
	public String call() throws Exception {
		Thread.sleep(10);
		return "A Executor";
	}
	
}
class ExecutorB implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(10);
		return "B Executor";
	}
	
}