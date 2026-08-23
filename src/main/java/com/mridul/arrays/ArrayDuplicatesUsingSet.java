package com.mridul.arrays;

import java.util.HashSet;

public class ArrayDuplicatesUsingSet {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40, 50};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr){
            if (!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements in the array:");
        for (int dup : duplicates){
            System.out.println(dup);
        }
    }
}
