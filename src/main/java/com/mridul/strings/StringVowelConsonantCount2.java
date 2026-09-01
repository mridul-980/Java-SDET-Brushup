package com.mridul.strings;

public class StringVowelConsonantCount2 {

    public static void main(String[] args) {

        String input = "SDET Automation Engineer";

        int vowels = 0;
        int consonants = 0;

        StringBuilder vowelList = new StringBuilder();
        StringBuilder consonantsList = new StringBuilder();

        for (char ch : input.toCharArray()){
            char lower = Character.toLowerCase(ch);

            if (Character.isLetter(lower)){
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u'){
                    vowels ++;
                    vowelList.append(lower).append(" ");
                } else {
                    consonants++;
                    consonantsList.append(lower).append(" ");
                }
            }
            // Ignore spaces, digits, punctuations

        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Vowels: " + vowelList.toString().trim());
        System.out.println("Consonants: " + consonantsList.toString().trim());
    }

}
