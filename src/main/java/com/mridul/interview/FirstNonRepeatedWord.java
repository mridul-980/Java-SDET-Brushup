package com.mridul.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedWord {
    public static void main(String[] args) {
        String sentence = "this is a test this is only a test";
        //Split sentence into words
        String[] words = sentence.split("\\s+");

        //Build frequency map using LinkedHashmap (preserves insertion order)
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        for (String word : words){
            freqMap.put(word, freqMap.getOrDefault(word, 0)+1);
        }
        //Traverse map to find first non-repeated word
        String firstNonRepeated = null;
        for (Map.Entry<String, Integer> entry : freqMap.entrySet() ){
            if (entry.getValue() == 1){
                firstNonRepeated = entry.getKey();
                break;
            }
        }
        // print result
        if (firstNonRepeated != null){
            System.out.println("First Non-repeated word = "+ firstNonRepeated);
        }else {
            System.out.println("No non-repeated word found");
        }
    }
}
