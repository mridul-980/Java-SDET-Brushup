package com.mridul.strings;

public class StringVowelConsonantCount {
    public static void main(String[] args) {
        String input = "SDET Automation Engineer";

        int vowels = 0;
        int consonants = 0;

        for (char ch : input.toCharArray()) {
            // Normalize to lowercase
            char lower = Character.toLowerCase(ch);

            // check if letter
            if (Character.isLetter(lower)){
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u'){
                    vowels ++ ;
                } else {
                    consonants ++ ;
                }
            }
            // Ignore spaces, digits, punctuation
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = "+ consonants);
    }
}
