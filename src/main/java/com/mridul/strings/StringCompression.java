package com.mridul.strings;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aaabbccccd";

        String compressed = compress(input);
        System.out.println(compressed);
    }

    private static String compress(String s) {
        if (s == null || s.isEmpty()) return "" ;

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i =1 ; i< s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1)) {
                count ++ ;
            } else {
                // Append previous character and its count
                result.append(s.charAt(i-1)).append(count);
                count =1; //reset count
            }
        }
        // Append the last character group
        result.append(s.charAt(s.length()-1)).append(count);

        return  result.toString();
    }
}
