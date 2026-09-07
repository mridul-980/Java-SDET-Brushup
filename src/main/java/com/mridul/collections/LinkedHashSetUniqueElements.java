package com.mridul.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetUniqueElements {
    public static void main(String[] args) {

        int[] numbers = {40, 10, 30, 20, 50, 10, 40};

        // create LinkedHashSet
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        // Add All elements
        for (int num : numbers){
            uniqueNumbers.add(num);
        }
        // print unique values (in insertion order)
        System.out.println("Unique Values: " + uniqueNumbers);
    }
}
