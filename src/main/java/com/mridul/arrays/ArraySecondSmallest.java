package com.mridul.arrays;

public class ArraySecondSmallest {
    public  static  void  main (String[] args){

        int[] numbers = {10,45,23,89,12,67};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers){
            if (number < smallest){
                secondSmallest = smallest;
                smallest = number;
            } else if ( number < secondSmallest && number != smallest){
                secondSmallest = number;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE){
            System.out.println("No second smallest element is found");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
        }
    }
}
