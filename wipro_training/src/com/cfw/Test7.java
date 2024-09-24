package com.cfw;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test7 {
	
	public static void main(String[] args) {
		
		//create an object of Map interface
		
		Map<Integer,String> m = new LinkedHashMap<>();
		
		m.put(100, "ram");
		m.put(null, null);
		m.put(200, "rk");
		
		for(Map.Entry<Integer,String> me : m.entrySet())
		{
			
			System.out.println(me.getKey() + " " + me.getValue());
		//System.out.println();
		}
		
		
	}

}
