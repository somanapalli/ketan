package com.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test4 {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("ayush.txt");
		
		pw.println("sakshi");
		pw.println(78965);
		pw.println(true);
		pw.println(5.11);
		pw.println('A');
		
		pw.flush();
		System.out.println("operation done");
		
	}
}
