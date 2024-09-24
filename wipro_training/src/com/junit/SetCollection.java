package com.junit;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	
	public Set<Object> createSet()
	{
		
		Set<Object> s = new HashSet();
		s.add("ram");
		s.add(89);
		s.add(null);
		s.add(true);
		return s;	
	}
	public static void main(String[] args) {
		
		SetCollection sc = new SetCollection();
		System.out.println(sc.createSet());
	}
}
