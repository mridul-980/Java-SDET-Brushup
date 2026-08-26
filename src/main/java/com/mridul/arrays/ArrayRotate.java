package com.mridul.arrays;

import static java.util.Collections.reverse;

public class ArrayRotate {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int k = 2 ; // rotate right by 2
        int n = numbers.length;

        // normalize k (in case k > n)
        k=k%n;

        // Step1 : Reverse entire array
        reverse(numbers, 0, n-1);

        // Step2 : Reverse first k elements
        reverse(numbers, 0 , k-1);

        // Step3 : Reverse remaining elements
        reverse(numbers, k , n-1);

        // Print results
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // helper method to reverse part of the array
    private static void reverse(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end-- ;
        }
    }
}
