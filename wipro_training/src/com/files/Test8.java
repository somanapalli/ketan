package com.files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test8 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Deserialization - ObjectInputStream
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("rk.txt"))) {
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    System.out.println(student.getStid() + " " + student.getStname());
                } catch (EOFException e) {
                    // Reached end of file, stop the loop
                    break;
                }
            }
        }
    }
}
