package com.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = 
				new BufferedWriter(new FileWriter("ayush.txt"));
		
		bw.write("laxmi");
		bw.newLine();
		bw.write("sai");
		bw.newLine();
		bw.write("sneha");
		bw.newLine();
		bw.write(98765);
		bw.newLine();
		bw.write("tanisha");
		bw.newLine();
		
		
		bw.flush();
		
		System.out.println("data writeen successfully");
		
		
	}
}
