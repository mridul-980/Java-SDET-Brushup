package com.mridul.interview;

import java.util.HashMap;
import java.util.Map;

public class WordFreqCounter {
    public static void main(String[] args) {

        String sentence = "selenium is fun selenium is good";
        String[] words = sentence.split("\\s+");

        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words){
            freqMap.put(word, freqMap.getOrDefault(word, 0)+ 1);
        }
        System.out.println("Word frequencies: ");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey()+ " -> "+ entry.getValue());
        }
    }
}
