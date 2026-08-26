package com.mridul.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayTwoSum {
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        // Map to store numbers -> index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i =0; i<numbers.length; i++) {
            int num = numbers[i];
            int complement = target-num;

            // Step 1 : Check if complement exists
            if (map.containsKey(complement)) {
                System.out.println(complement + " + " + num + " = " + target);
                return;  // stop after finding the pair
            }

            // Step 2 : Store current number
            map.put(num, i);
        }
        System.out.println("No two numbers found that sum to " + target);
    }
}
