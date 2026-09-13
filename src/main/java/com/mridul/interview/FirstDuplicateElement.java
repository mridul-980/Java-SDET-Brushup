package com.mridul.interview;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        int[] numbers = {5,3,5,4,3,5,6};

        Set<Integer> seen = new HashSet<>();

        //holds the result. If no duplicate exists after checking every element, it remains -1.
        int firstDuplicate = -1;  // sentinel value

        for (int num : numbers){
            if (seen.contains(num)){
                firstDuplicate = num;
                break;    // stop at the first duplicate
            } else {
                seen.add(num);
            }
        }
        if (firstDuplicate != -1){
            System.out.println("First duplicate element: " + firstDuplicate);
        } else {
            System.out.println("No duplicate element found");
        }
    }
}
