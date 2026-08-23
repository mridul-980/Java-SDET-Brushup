package com.mridul.arrays;

public class ArraySecondLargest {
    public  static void main (String[] args){
        int[] numbers = {10,45,23,89,12,67};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers){
            if (number > largest){
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
