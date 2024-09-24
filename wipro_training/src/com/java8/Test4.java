package com.java8;

import java.util.Scanner;
import java.util.function.Function;

public class Test4 {
	//R apply(T t);
	public static void main(String[] args) {
		
		Function<String, Integer> function = x->x.length();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the word");
		String word = s.next();
		System.out.println("the length of given word is: " + function.apply(word));
	}

}
