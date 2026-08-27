package com.mridul.strings;

public class StringReverseUsingLoop {
    public static void main(String[] args) {

        String input = "SDET";
        // Using a Loop
        String reversed = "";
        for (int i = input.length()-1 ;  i>=0 ; i--){
            reversed += input.charAt(i); //append charcater in reverse order
        }
        System.out.println("Reversed String (Loop): " + reversed);
    }
}
