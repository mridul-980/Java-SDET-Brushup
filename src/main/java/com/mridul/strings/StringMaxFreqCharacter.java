package com.mridul.strings;

import java.util.HashMap;
import java.util.Map;

public class StringMaxFreqCharacter {
    public static void main(String[] args) {

        String input = "Engineering";

        // Step1 : Build freq Map
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) +1);
        }
        // Step2 : Track max freq and first character
        int maxFreq = 0;
        char maxChar = '\0';

        for (char ch : input.toCharArray()){
            int freq =  freqMap.get(ch);
            if (freq>maxFreq){
                maxFreq = freq;
                maxChar = ch;
            }
        }
        System.out.println("Character with max frequency = " + maxChar);
    }
}
