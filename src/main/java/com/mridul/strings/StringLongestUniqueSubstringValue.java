package com.mridul.strings;

import java.util.HashSet;
import java.util.Set;

public class StringLongestUniqueSubstringValue {
    public static void main(String[] args) {
        String input = "pwwkew";

        String result = longestUniqueSubstring(input);
        System.out.println("Longest Unique substring = " + result);
        System.out.println("Length = " + result.length());
    }

    private static String longestUniqueSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0, right = 0;
        int maxLength = 0;
        int startIndex = 0;  // tracks where the best substring begins

        while (right < s.length()) {
            char ch = s.charAt(right);

            // if duplicate, shrink window from the left
            while (window.contains(ch)) {
                window.remove(s.charAt(left));
                left++;
            }
            // add current character
            window.add(ch);

            // update max leng and starting index
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
            right++;
        }
        // return the substring itself
        return s.substring(startIndex, startIndex + maxLength);
    }
}
