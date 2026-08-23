package com.mridul.arrays;

public class ArraySecondLargest2 {

    public static  void main (String[] args){
        int[] numbers = {10,45,23,89,12,67};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean foundSecond = false;

        for(int number : numbers){
            if (number > largest){
                secondLargest = largest;
                largest = number;

                if (secondLargest != Integer.MIN_VALUE){
                    foundSecond = true;
                }
            } else if (number < largest && number> secondLargest) {
                secondLargest = number;
                foundSecond = true;
            }
        }
        if (foundSecond){
            System.out.println("second Largest: "+ secondLargest);
        } else {
            System.out.println("No second largest distinct element found");
        }

    }
}
