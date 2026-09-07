package com.mridul.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        // Create ArrayList
        List<String> tools = new ArrayList<>();
        // Add
        tools.add("Selenium");
        tools.add("TestNG");
        tools.add("RestAssured");
        tools.add("Jenkins");

        // Print the list
        System.out.println("Initial list: " + tools);

        // Add java at index 1
        tools.add(1, "Java");

        // remove TestNG
        tools.remove("TestNG");

        // check whether selenium exists
        boolean isSeleniumExists = tools.contains("Selenium");

        // get the element at index 2
        String elementAtIndex2 = tools.get(2);

        //  print final size
        System.out.println("Final list: " + tools);

        // Print checks
        System.out.println("Contains Selenium: " + isSeleniumExists);
        System.out.println("Element at Index 2: " + elementAtIndex2);
        System.out.println("Size: "+tools.size());
    }
}
