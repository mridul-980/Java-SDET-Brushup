package com.mridul.interview;

import java.util.HashMap;
import java.util.Map;

public class CharacterFreq {
    public static void main(String[] args) {
        String input = "selenium";

        // Build frequency map
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+ 1);
        }
        // print frequencies
        System.out.println("Character frequencies");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }
    }
}
