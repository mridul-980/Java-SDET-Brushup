package com.mridul.arrays;

import java.util.HashMap;

public class ArrayFirstNonRepeated {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40, 50};
        // Step:1 Build the freq map
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num :  arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        //step:2 Traverse the original array again
        int firstNonRepeated = -1; // sentinel value
        for (int  num :arr){
            if (freqMap.get(num) == 1){
                firstNonRepeated = num;
                break;
            }
        }
        if (firstNonRepeated != -1){
            System.out.println("First Non-repeated Element: " + firstNonRepeated);
        } else {
            System.out.println("No non repetaed element found");
        }
    }
}
