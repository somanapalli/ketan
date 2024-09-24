//calling program
package com.exceptionhandling;

public class Test4 {

	//calling method
	public static void main(String[] args) {
		
		Test3 obj = new Test3();
		try {
		obj.division();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("check divsion method once, it is very dangerous");
		}
		
		System.out.println("Rest statements will be executed");
		
	}
}
