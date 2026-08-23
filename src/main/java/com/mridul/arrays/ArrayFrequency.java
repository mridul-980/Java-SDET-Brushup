package com.mridul.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        // create a frequency map
        HashMap<Integer , Integer> freqMap = new HashMap<>();

        for (int num : arr){
            // If num already exists, increment count; otherwise start at 1
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        // print frequencies
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
