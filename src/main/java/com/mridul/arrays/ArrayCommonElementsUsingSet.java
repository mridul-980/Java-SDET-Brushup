package com.mridul.arrays;

import java.util.HashSet;

public class ArrayCommonElementsUsingSet {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();

        // Add all elements of arr1 into set
        for (int num : arr1) {
            set.add(num);
        }
        // check arr2 elements against set
        for (int num : arr2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }
        System.out.println("Common elements (Using Hashset) : ");
        for (int num : common){
            System.out.print(num + " ");
        }
    }
}
