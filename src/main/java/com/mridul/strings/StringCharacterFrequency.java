package com.mridul.strings;

import java.util.HashMap;
import java.util.Map;

public class StringCharacterFrequency {
    public static void main(String[] args) {

        String input = "automation";

        // Step1 : create a frequency map
        Map<Character, Integer> freqMap = new HashMap<>();

        // Step2 : Traverse each character in the string
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch,0) +1);
        }

        // Print frequencies
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
