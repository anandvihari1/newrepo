package com.genpact.projectk.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Anand", 20);
		map.put("Anand", 30);
		System.out.println(map.get("Anand").hashCode());
	}

}
