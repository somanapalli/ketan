package com.files;

import java.io.File;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("ayush.txt");
		
		f.createNewFile();
		
		System.out.println(f.exists());
	}
}
