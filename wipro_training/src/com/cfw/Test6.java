package com.cfw;

import java.util.ArrayList;
import java.util.List;

public class Test6 {

    // Method with unbounded wildcard: Accepts a list of any type
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    // Method with upper-bounded wildcard: Accepts a list of Number or its subclasses
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    // Method with lower-bounded wildcard: Accepts a list of Integer or its superclasses
    public static void addNumberToList(List<? super Integer> list) {
        list.add(42); // Adding an Integer to the list
    }

    public static void main(String[] args) {
        // Example 1: Unbounded wildcard
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("Printing String List:");
        printList(stringList); // Can print any type of list

        // Example 2: Upper-bounded wildcard (List<? extends Number>)
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        System.out.println("\nPrinting Integer List:");
        printNumbers(integerList); // List of Integer is allowed because Integer extends Number

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(6.28);
        System.out.println("\nPrinting Double List:");
        printNumbers(doubleList); // List of Double is allowed because Double extends Number

        // Example 3: Lower-bounded wildcard (List<? super Integer>)
        List<Number> numberList = new ArrayList<>();
        addNumberToList(numberList); // Adding Integer to a list of Number
        System.out.println("\nNumber List after adding Integer:");
        printList(numberList); // Print the list to verify added element

        List<Object> objectList = new ArrayList<>();
        addNumberToList(objectList); // Adding Integer to a list of Object
        System.out.println("\nObject List after adding Integer:");
        printList(objectList);
    }
}