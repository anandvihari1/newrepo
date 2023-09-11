package com.genpact.projectk.coding;

public class SquareRootofNumberPerfectSquare {
	public static void main(String[] args) {
		Integer num=810;
		Boolean square=findSquareRoot(num);
		if(square)
			System.out.println(Math.sqrt(num));
	}
	static Boolean findSquareRoot(Integer num) {
		 var sqrt=Math.sqrt(num);
		 return (Math.sqrt(num)-Math.floor(sqrt))==0;
	}

}
