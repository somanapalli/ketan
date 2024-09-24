package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Test7 {
    // static method
	//R apply(T t);
	//void println(String x)
	//void accept(T t);
    public static void main(String[] args) {
        
    	List<String> list = Arrays.asList("sanket","bhavna","sakshi","ketan","twinkle");
    	//list.forEach(x->System.out.println(x));
    	list.forEach(System.out::println);
       
    	
    }
}