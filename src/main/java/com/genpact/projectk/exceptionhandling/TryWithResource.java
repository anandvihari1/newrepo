package com.genpact.projectk.exceptionhandling;

import java.io.FileInputStream;

public class TryWithResource {
	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("trywithresource.txt")){
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
