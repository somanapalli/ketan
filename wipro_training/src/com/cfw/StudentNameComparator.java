package com.cfw;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getStname().compareTo(o1.getStname());
	}

}
