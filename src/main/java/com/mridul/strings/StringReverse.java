package com.mridul.strings;

public class StringReverse {
    public static void main(String[] args) {
        String input = "QA MRIDUL";

        //Using StringBuilder
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed String (StringBuilder): " + reversed);
    }
}
