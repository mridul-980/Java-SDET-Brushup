package com.mridul.strings;

import java.util.HashSet;
import java.util.Set;

public class StringLongestUniqueSubstring {
    public static void main(String[] args) {

        String input = "abcabcbb";

        int length = longestUniqueSubstring(input);
        System.out.println("Length of longest substring without repeating characters = " + length);

    }
    private static int longestUniqueSubstring(String s){
        // null handling
        if (s == null || s.isEmpty()) {
            return  0;
        }
        Set<Character> window = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()){
            char ch = s.charAt(right);

            // if duplicate, shrink window from the left
            while (window.contains(ch)){
                window.remove(s.charAt(left));
                left++;
            }

            // add current character
            window.add(ch);

            // update max length
            maxLength = Math.max(maxLength, right-left +1);

            // Expand window
            right++ ;
        }
        return maxLength;
    }
}
