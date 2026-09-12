package com.mridul.interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {

        String input = "automation";

        //build frequency map
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        // print character with frequency > 1
        System.out.println("Duplicate characters: ");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }

    }
}
