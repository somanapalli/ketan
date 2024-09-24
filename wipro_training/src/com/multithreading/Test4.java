package com.multithreading;

public class Test4 {
	
	public static void main(String[] args) {
		
		
		Table obj = new Table();
		
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		//t1.setPriority(67);
		//t2.setPriority(-2);
		
		t1.start();
		
		t2.start();
		
	}

}
