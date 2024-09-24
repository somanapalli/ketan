package com.java8;

import java.util.TreeSet;


public class Test2 {
	
	// int compare(T o1, T o2);
	public static void main(String[] args) {
		
		//TreeSet<Student> ts = new TreeSet<>((x,y)-> y.getStid().compareTo(x.getStid()));
		
		TreeSet<Student> ts = new TreeSet<>((x,y)-> y.getStname().compareTo(x.getStname()));
		ts.add(new Student(100,"rk"));
		ts.add(new Student(56,"sanket"));
		ts.add(new Student(435,"bhavna"));
		System.out.println(ts);
		
	}

}
