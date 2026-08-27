package com.mridul.strings;

public class StringPalindromeTwoPointer {
    public static void main(String[] args) {
        String input = "MADAM";

        int start = 0;
        int end = input.length()-1 ;
        boolean isPalindrome = true ;

        // Compare the characters from both sides
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }

    }
}
