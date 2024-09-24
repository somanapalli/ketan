package com.java8;

import java.util.Scanner;
import java.util.function.Consumer;

public class Test6 {
	public static void main(String[] args) {
		//  void accept(T t);
		Consumer<String> consumer = x->System.out.println("uppercase word is: " + x.toUpperCase());
		Scanner s = new Scanner(System.in);
		System.out.println("enter the word");
		String word = s.next();
		consumer.accept(word);
	}

}
