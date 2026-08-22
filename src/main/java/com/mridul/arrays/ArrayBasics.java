package com.mridul.arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        System.out.println(numbers.length);

        numbers[2] = 300;
        System.out.println(numbers[2]);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}