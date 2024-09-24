package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test8 {

	public static void main(String[] args) {

		//boolean test(T t);
		//  R apply(T t);
		List<String> list = 
		Arrays.asList("sanket", "bhavna", "sakshi", "ketan", "twinkle");
		
		Stream<Integer> stream = Stream.of(10,2,37,14,52,6,77,38,95);
		
		Stream<Student> studentStream = Stream.of(new Student(100,"sanket"),
				
				                                  new Student(67,"tanisha"),
				                                  new Student(72,"mobina"),
				                                  new Student(786,"twinkle"),
				                                  new Student(23,"bhavna")
				) ;
				
		
		list.stream().
		filter(x->x.startsWith("s")).forEach(System.out::println);
		
		list.stream().map(x->x+"-wipro").forEach(System.out::println);
		
		
		//stream.sorted().forEach(System.out::println);
		
		list.stream().sorted().forEach(System.out::println);
		// int compare(T o1, T o2);
		System.out.println("================================");
		//stream.sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
		
		System.out.println("====================================");
		studentStream
		.sorted((x,y)->y.getStname()
				.compareTo(x.getStname()))
		              .forEach(System.out::println);
		
		
		//System.out.println("minimum value is: " + stream.min((x,y)->x.compareTo(y)).get());
		
		//System.out.println("maximum value is: " +stream.max((x,y)->x.compareTo(y)).get());
		//R apply(T t, U u)
		int sum = stream.reduce((x,y)->x+y).get();
		System.out.println("sum is :" + sum);
		
	}
}
