package com.cfw;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		//runtime polymorphism
		Set s = new LinkedHashSet();
		
	    s.add(123);
	    s.add("ram");
	    s.add(3.4);
	    s.add(123);
	    s.add(null);
	    
	    System.out.println(s);
		
	}

}
