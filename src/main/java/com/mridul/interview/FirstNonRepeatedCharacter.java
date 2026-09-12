package com.mridul.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
       String input = "swiss";

       // Build frequency map using LinkedHashMap (preserves insertion order)
       Map<Character, Integer> freqMap = new LinkedHashMap<>();
       for (char ch : input.toCharArray()){
           freqMap.put(ch, freqMap.getOrDefault(ch, 0) +1);
       }

       //Traverse map  in insertion order to find first non repeated charactter
       char firstNonRepeated = '\0';
       for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
           if (entry.getValue() == 1){
               firstNonRepeated = entry.getKey();
               break;
           }
       }
       // print result
       if (firstNonRepeated != '\0'){
           System.out.println("First Non repeated character = " + firstNonRepeated);
       } else {
           System.out.println("No Non=repeated character found");
       }
    }
}
