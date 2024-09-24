package com.cfw;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test3 {
	
	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.add(123);
		q.add("ram");
		q.add(7.8);
		
		q.add(123);
		
		System.out.println(q.poll());
		
		
		System.out.println(q);
		
		q.offer(false);
		
		System.out.println(q);
		
		System.out.println(q.peek());//ram
		
		System.out.println(q);//[ram,7.8,123,false]
		
		
		
	}

}
