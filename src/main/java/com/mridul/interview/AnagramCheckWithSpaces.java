package com.mridul.interview;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheckWithSpaces {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("Are they Anagram? " + areAnagrams(s1,s2));
    }
    // Method to check anagram using frequency map
    private static boolean areAnagrams (String s1, String s2) {

        // Normalization & Sanitization , lowercase + remove spaces
        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");

        // Quick length check
        if (s1.length() != s2.length()){
            return  false;
        }
        // Build frequency map for s1
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s1.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        // Decrease counts using s2
        for (char ch : s2.toCharArray()){
            if (!freqMap.containsKey(ch)){
                return false;
            }
            freqMap.put(ch, freqMap.get(ch)-1);
            if (freqMap.get(ch) == 0){
                freqMap.remove(ch);
            }
        }
        // If map is empty, strings are anagrams
        return freqMap.isEmpty();
    }
}
