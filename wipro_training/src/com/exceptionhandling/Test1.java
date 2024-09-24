package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// static area
		try {
			System.out.println("enter first number");

			int fno = scanner.nextInt();

			System.out.println("enter second number");

			int sno = scanner.nextInt();

			int division = fno / sno;

			System.out.println("division is: " + division);
		} catch (ArithmeticException ae) {
			System.out.println("don't enter zero as denominator");
		} catch (InputMismatchException ime) {
			System.out.println("please pass only numeric values");
		}
		
		finally {
			System.out.println("finally block executed always");
		}

		System.out.println("rest of the satements also executed");
		System.out.println("rest of the satements also executed");
		System.out.println("rest of the satements also executed");
		System.out.println("rest of the satements also executed");

	}
}
