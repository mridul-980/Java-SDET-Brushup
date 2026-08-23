package com.mridul.arrays;

public class ArrayReverse {
    public static void main (String[] args){
        int[] numbers = {10,20,30,40,50};

        System.out.println("Original Array");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Reverse logic
        int n = numbers.length;
        for (int i=0; i < n/2 ; i++){
            int temp = numbers[i];
            numbers[i] = numbers[n-1-i];
            numbers[n-1-i] = temp;
        }
        System.out.println("Reversed Array");
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}
