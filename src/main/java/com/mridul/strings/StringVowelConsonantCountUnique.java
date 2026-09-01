package com.mridul.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringVowelConsonantCountUnique {
    public static void main(String[] args) {

        String input = "SDET Automation Engineer";
        int vowels = 0;
        int consonants = 0;

        Set<Character> vowelSet = new LinkedHashSet<>();
        Set<Character> consonantSet = new LinkedHashSet<>();

        for (char ch : input.toCharArray()){
            char lower = Character.toLowerCase(ch);

            if (Character.isLetter(lower)) {
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                    vowelSet.add(lower);
                } else {
                    consonants++;
                    consonantSet.add(lower);
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Unique Vowels: " + vowelSet);
        System.out.println("Unique Consonants: " + consonantSet);
    }
}
