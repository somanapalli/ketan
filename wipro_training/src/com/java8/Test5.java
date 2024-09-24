package com.java8;

import java.util.Scanner;
import java.util.function.Supplier;

public class Test5 {
	//  T get();
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		Supplier<String> supplier = ()->{  
			
			System.out.println("enter the name");
			String name = s.nextLine();
			return name;
			
		};
		System.out.println("my name is " + supplier.get());
	}

}
