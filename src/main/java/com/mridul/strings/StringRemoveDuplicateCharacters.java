package com.mridul.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemoveDuplicateCharacters {
    public static void main(String[] args) {

        String input = "programming";

        // Step1 : Use LinkedHashSet to preserve the insertion order
        Set<Character> seen = new LinkedHashSet<>();
        for (char ch : input.toCharArray()) {
            seen.add(ch); // duplicates automatically ignored
        }

        // Step2 : Build result string
        StringBuilder result = new StringBuilder();
        for (char  ch : seen){
            result.append(ch);
        }
        // Step3 : Print result
        System.out.println(result.toString());
    }
}
