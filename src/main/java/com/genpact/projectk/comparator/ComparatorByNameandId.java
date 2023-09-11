package com.genpact.projectk.comparator;

import java.util.Comparator;

public class ComparatorByNameandId implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		int res=s2.getName().compareTo(s1.getName());
		if(res !=0)
			return res;
		return s2.getId()-s1.getId();
		
	}
}
