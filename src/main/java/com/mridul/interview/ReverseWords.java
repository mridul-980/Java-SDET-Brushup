package com.mridul.interview;

public class ReverseWords {
    public static void main(String[] args) {

        String input = "Java Selenium Automation";

        // split the sentence into words
        String[] words = input.split("\\s+");

        //reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length -1 ; i >=0; i--){
            reversed.append(words[i]).append(" ");
        }

        //trim and print result
        System.out.println("Reversed sentences: " + reversed.toString().trim());
    }
}
