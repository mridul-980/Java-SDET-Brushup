package com.mridul.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetUniqueElements {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 40, 50, 40};

        // Create HashSet
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Add all elements
        for (int num : numbers){
            uniqueNumbers.add(num);
        }
        // Print unnique values
        System.out.println("Unique values: "+ uniqueNumbers);
    }
}
