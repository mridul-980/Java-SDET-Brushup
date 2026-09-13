package com.mridul.interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateIntegersHashMap {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40, 10, 50};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : numbers){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        System.out.println("Duplicate (HashMap): ");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }



}
