package com.mridul.interview;

public class MissingNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5, 6};
        // total numbers should be 6 (since one is missing)
        int n = numbers.length+1;

        // Calculate expected sum of 1..n
        int expectedSum = n * (n+1) / 2 ;
        // Calculate actual sum of array elements
        int actualSum = 0;
        for (int num : numbers){
            actualSum += num;

        }

        // Missing number = expectedSum - actualSum
        int missingNum = expectedSum - actualSum;
        System.out.println("Missing Numbers: "+ missingNum);
    }
}
