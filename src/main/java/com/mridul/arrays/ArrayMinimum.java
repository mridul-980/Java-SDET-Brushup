package com.mridul.arrays;

public class ArrayMinimum {
    public  static void main(String[] args){

        int[] numbers =  {10,45,23,89,12,67};
        int min = numbers[0];

        for ( int number : numbers) {
            if (number < min){
                min = number;
            }
        }
        System.out.println(min);
    }
}
