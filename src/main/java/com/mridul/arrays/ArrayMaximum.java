package com.mridul.arrays;

public class ArrayMaximum {
    public static void main(String[] args){
        int[] numbers = {10,45,23,89,12,67};
        int max = numbers[0];
        for (int number : numbers){
            if (number > max){
                max = number;
            }
        }
        System.out.println(max);
    }
}
