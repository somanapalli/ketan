package com.files;

import java.io.FileReader;
import java.io.IOException;

public class Test5 {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("ayush.txt");
		
		int x = fr.read();
		
		
		while(x!=-1)
		{
			System.out.print((char)x);
			x=fr.read();
		}
	}

}
