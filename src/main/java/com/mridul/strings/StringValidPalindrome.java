package com.mridul.strings;

public class StringValidPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        if (isValidPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    // Method to check valid palindrome
    private static boolean isValidPalindrome(String s){
        int start = 0;
        int end = s.length() -1;

        while (start<end){
            // skip non-alphanumeric characters
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start ++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            // comparing characters ignoring case
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
