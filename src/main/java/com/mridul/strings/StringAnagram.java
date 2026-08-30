package com.mridul.strings;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (isAnagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
    // Method to check anagram using freq map
    private static boolean isAnagram(String s1, String s2) {
        // Step 1 :  Quick length check
        if (s1.length() != s2.length()){
            return false;
        }
        // Step 2 : Build freq Map for s1
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s1.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) +1);
        }
        // Step 3 : Decrease counts using s2
        for (char ch : s2.toCharArray()) {
            if (!freqMap.containsKey(ch)){
                return false;
            }
            freqMap.put(ch, freqMap.get(ch) -1 );
            if (freqMap.get(ch) == 0){
                freqMap.remove(ch);
            }
        }
        // Step 4 : If map is empty, strings are anagrams
        return freqMap.isEmpty();
    }

}
