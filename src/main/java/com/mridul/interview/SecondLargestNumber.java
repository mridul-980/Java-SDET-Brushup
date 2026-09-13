package com.mridul.interview;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10,25,5,40,30};

        // initialize first and second largest
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : numbers){
            if (num > first){
                // Update both first and second
                second = first;
                first = num;
            } else if (num > second && num != first) {
                // update second only
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE){
            System.out.println("No second largest number found");
        } else {
            System.out.println("Second Largest: " + second);
        }
    }
}
