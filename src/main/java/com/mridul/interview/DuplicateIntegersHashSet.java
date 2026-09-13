package com.mridul.interview;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateIntegersHashSet {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 10, 50};

        Set<Integer> seen = new HashSet<>();  // Tracks every unique integer encountered so far.

        Set<Integer> duplicate = new HashSet<>(); //Stores the integers that appear more than once.

        for (int num : numbers){
            if (!seen.add(num)){    //Attempts to add num to seen. If seen.add(num) returns false, !false evaluates to true, meaning num is a duplicate.
                duplicate.add(num);
            }
        }
        System.out.println("Duplicates (HashSet): " + duplicate);
    }
}
