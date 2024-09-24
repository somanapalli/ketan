package com.files;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("ayush.txt");
		
		fw.write("aditya\n");
		fw.write("rk\n");
		fw.write("tanisha\n");
		fw.write(78967);
		fw.write("wipro\n");
		
		fw.flush();
		
		System.out.println("write operation done");
		
	}

}
