package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test7 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("rk.txt"));

		Student st1 = new Student(100,"lakshmi");
		Student st2= new Student(87,"riyaz");
		
		oos.writeObject(st1);
		oos.writeObject(st2);
		
		oos.flush();
		
		System.out.println("serialization has done");
	}

}
