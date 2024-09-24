package com.cfw;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test8 {
	public static void main(String[] args) {
		
		SortedMap<Student,String> sm = new TreeMap<>(new StudentNameComparator());
		
		sm.put(new Student(100,"ram"), "ram");
		sm.put(new Student(45,"sanket"), "sanket");
		
		sm.put(new Student(345,"ketan"), "ketan");
		
		System.out.println(sm);
		
		System.out.println();
		
		
		
	}

}
