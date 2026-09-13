package com.mridul.interview;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static void main(String[] args) {
        String sentence = "selenium java selenium api java selenium";
        // Step 1: Split sentence into words
        String[] words = sentence.split("\\s+");

        // Step 2: Build frequency map
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words){
            freqMap.put(word, freqMap.getOrDefault(word, 0)+1);
        }
        // Step 3: Find the word with maximum frequency
        String mostFrequent = null;
        int maxCount = 0;
        for (Map.Entry<String,Integer> entry : freqMap.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        // Step 4: Print result
        if (mostFrequent != null){
            System.out.println("Most frequent word = "+ mostFrequent);
        } else {
            System.out.println("No words found!");
        }
    }
}
