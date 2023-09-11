package com.genpact.projectk.exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

//parent class no method only runtime in overrideen method
//exception in parent method=>same or child or no exception but not parent
public class OverrideRules {

}
class Parent{
	void m1() throws StackOverflowError{}
}
class Child extends Parent{
	void m1(){
		
	}
}
