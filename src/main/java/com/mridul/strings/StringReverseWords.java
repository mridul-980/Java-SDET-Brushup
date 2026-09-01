package com.mridul.strings;

public class StringReverseWords {
    public static void main(String[] args) {
        String input = "I am an SDET";

        // Step1 : Split the string into words
        String[] words = input.split(" ");

        // Step2 : Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length -1; i>=0 ; i--){
            reversed.append(words[i]).append(" ");
        }

        // Step3 : Trim and print the result
        System.out.println(reversed.toString().trim());
    }
}
