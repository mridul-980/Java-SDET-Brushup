package com.mridul.strings;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicateCharacter {

    public static void main(String[] args) {

        String input = "programming";

        // Step1 : Build the frequency map
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) +1 );
        }

        // Step2 : Print character with frequency > 1
        System.out.println("Duplicate characters");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            if (entry.getValue() > 1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
