package com.mridul.arrays;

public class ArrayMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6};

        int n = numbers.length+1; //total number should be 6
        // Step 1 : calculate expected sum of 1...n
        int expectedSum = n * (n+1)/2 ;
        // Step 2: calculate actual sum of array of elements
        int actualSum =0;
        for (int num : numbers){
            actualSum += num;
        }
        // Step 3 : Missing number = expectedSum - actualSum
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number = " + missingNumber);
    }
}
