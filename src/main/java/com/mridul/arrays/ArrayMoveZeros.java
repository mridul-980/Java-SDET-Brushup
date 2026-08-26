package com.mridul.arrays;

public class ArrayMoveZeros {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};

        int nonZeroIndex =0; // pointer for placing non-zero elements

        //Step1 : Move non zero elements forward
        for (int num : numbers){
            if (num !=0){
                numbers[nonZeroIndex]=num;
                nonZeroIndex ++ ;
            }
        }
        // Step2 : Fill remaining positions with zeros
        while (nonZeroIndex < numbers.length){
            numbers[nonZeroIndex] = 0;
            nonZeroIndex ++ ;
        }
        // print result
        for (int num : numbers){
            System.out.println(num+ " ");
        }
    }
}
