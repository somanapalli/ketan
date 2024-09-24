package com.exceptionhandling;

public class Test2 {
	//non static  block
	{
		System.out.println("iam instance block");
	}
	//static block
	static
	{
		System.out.println("iam static block");
	}
	public Test2()
	{
		System.out.println("iam constructor");
	}
	
	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		Test2 obj1 = new Test2();
	}

}
