package com.mridul.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        //1. Add 60 at the end
        numbers.add(60);

        //2. Add 5 at index 0
        numbers.add(0,5);

        //3. Remove the value of 30
        numbers.remove(Integer.valueOf(30));

        //4. Replace 40 with 45
        int indexOf40 = numbers.indexOf(40);
        if (indexOf40 != -1){
            numbers.set(indexOf40, 45);
        }

        //5. Find max number (without collections.max)
        int max = numbers.get(0);
        for (int num : numbers){
            if (num > max){
                max = num;
            }
        }
        //6. Find min number (without collections.min)
        int min = numbers.get(0);
        for (int num : numbers){
            if (num < min){
                min = num;
            }
        }
        //7. Reverse the list manually
        for (int i =0 , j=numbers.size()-1; i<j; i++, j--){
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(j));
            numbers.set(j, temp);
        }

        //8. Print final list
        System.out.println("Final List: " + numbers);
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+ min);
    }
}
