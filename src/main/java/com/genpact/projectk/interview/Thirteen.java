package com.genpact.projectk.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nums = [15,6,83,28,7]
		int num[]= {15,6,7,21};
		List<Integer> list=Arrays.stream(num).boxed().toList();
				//List<Integer> list=Arrays.asList(15,6,83,28,7);
				var highestEle=	list.stream()
				.sorted(Collections.reverseOrder())
				.findFirst().get();
				System.out.println(highestEle);
				//int [] vs ArrayLIST
				//1 —> 2 —> 3 —> 4 —> 5 —> 6 —> 7 FIND MIDDLE N/2 
				//curser1 1 2 3 4
				//curser2 1-> 3-> 5 7 next.next.element  ->6
				
				// 3. unsorted array longest conscutve number 1234-> 4 
	}

}
