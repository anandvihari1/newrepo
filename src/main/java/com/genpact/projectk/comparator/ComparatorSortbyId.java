package com.genpact.projectk.comparator;

import java.util.Comparator;

public class ComparatorSortbyId implements Comparator<Student>{
	
	@Override
	public int compare(Student s1,Student s2) {
		return s1.getId().compareTo(s2.getId());
	}
}
