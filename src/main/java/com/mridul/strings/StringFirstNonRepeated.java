package com.mridul.strings;

import java.util.HashMap;
import java.util.Map;

public class StringFirstNonRepeated {
    public static void main(String[] args) {

        String input = "swiss";

        // Build frequency map
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        // Traverse original string again
        char firstNonRepeated = '\0';   //sentinel value
        for (char ch : input.toCharArray()){
            if (freqMap.get(ch) == 1){
                firstNonRepeated =ch;
                break;
            }
        }
        // Print result
        if (firstNonRepeated != '\0'){
            System.out.println("First non-repeated character = "+ firstNonRepeated);
        } else {
            System.out.println("No non-repeated character found!");
        }
    }
}
