package com.genpact.projectk.interview;

public class Ten {

	public static void main(String[] args) {
		
		int[] arr= {3,5,6};//5*6*73*7
		//out put 3,5,6,73,7
		int[] out=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=0;j<arr.length;j++) {
				if(!(arr[i]==arr[j]))
				count=arr[j]*count;
			}
		out[i]=count;
		System.out.println(count);
		}
		
	}

}
