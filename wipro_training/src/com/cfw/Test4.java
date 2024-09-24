package com.cfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		
		//SortedSet<Student> s = new TreeSet<>(new StudentIdComparator());
		SortedSet<Student> s = new TreeSet<>(new StudentNameComparator());
		
		
		s.add(new Student(78,"mobina"));
		s.add(new Student(100,"sai"));
		s.add(new Student(67,"sanket"));
		
		
		
		for(Student s1:s)
		{
			System.out.println(s1.getStid() + "===>" + s1.getStname());
		}
		
	}
}


