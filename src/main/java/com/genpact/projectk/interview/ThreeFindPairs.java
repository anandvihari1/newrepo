package com.genpact.projectk.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThreeFindPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar= {2,4,5,6,1,7};
		int target=8;
		List<Integer> list=Arrays.stream(ar).boxed().collect(Collectors.toList());
		//brute force
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]==target) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
		
        Map<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<ar.length;i++) {
        	if(map.containsKey(target-ar[i])) {
        		System.out.println(ar[map.get(target-ar[i])]+" "+ar[i]);
        		count++;
        	}
        	map.put(ar[i], i);
        	
        	
        	
        }
        System.out.println(count);

	}

}
