package com.cfw;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		
		//created an object for ArrayList
		LinkedList al = new LinkedList();
		
		al.add(100);
		al.add("ram");
		al.add(6.5);
		al.add(true);
		al.add(100);
		al.add(null);
		
		System.out.println(al.get(5));
		System.out.println(al.size());
		System.out.println(al.contains("krishna"));
		System.out.println(al.indexOf(null));
		System.out.println(al.isEmpty());
		//al.clear();
		//System.out.println(al.isEmpty());
		
		System.out.println(al.remove(5));
		System.out.println(al);
		
		al.set(4, 200);
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		al1.add("rk");
		al1.add(5.6);
		al1.add(false);
		
		
		al.addAll(al1);
		System.out.println(al);
		
		al.removeAll(al1);
		
		System.out.println(al);
		
	}

}
