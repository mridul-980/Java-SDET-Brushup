package com.mridul.arrays;

public class ArrayRemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {10, 10, 20, 20, 20, 30, 40, 40};

        // i -> position of last unique element
        int i = 0 ;

        // j scans the array
        for (int j = 1 ; j < numbers.length ; j++) {
            if (numbers[j] != numbers[i]) {
                i++ ;
                numbers[i] = numbers[j] ;
            }
        }
        // Print only the unique portion (from 0 to i)
        for (int k =0 ; k <= i ; k++) {
            System.out.println(numbers[k] + " ");
        }
    }
}
