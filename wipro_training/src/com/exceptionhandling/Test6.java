package com.exceptionhandling;

import java.util.Scanner;

public class Test6 {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter the product weight?:");
		int weight = s.nextInt();
		Test5 obj = new Test5();
		obj.checkProduct(weight);
		
	}

}
