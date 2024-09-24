package com.java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class Test3 {

	//boolean test(T t);
	public static void main(String[] args) {
	Predicate<Integer> p = x->x%2==0;	
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number");
	int num = s.nextInt();
	System.out.println(p.test(num)?num + " is even ":num + " is odd");
	}
}
