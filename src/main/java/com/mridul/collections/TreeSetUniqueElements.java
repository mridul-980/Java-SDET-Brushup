package com.mridul.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetUniqueElements {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20, 50, 10, 40};

        // create TreeSet
        Set<Integer> uniqueNumbers = new TreeSet<>();

        // Add all elements
        for (int num : numbers){
            uniqueNumbers.add(num);
        }

        // Print unique values (sorted order)
        System.out.println("Unique Values (TreeSet): " + uniqueNumbers);
    }
}
