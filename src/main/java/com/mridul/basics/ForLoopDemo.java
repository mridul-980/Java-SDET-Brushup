package com.mridul.basics;

public class ForLoopDemo {
    public static  void main(String[] args){
        System.out.println("Printing from 1-20");
        for (int i = 1 ; i<=20 ;  i++){
            System.out.println(i);
        }
        System.out.println("Printing from 20-1");
        for (int i=20; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("Printing even numbers from 2-50");
        for (int i=2; i<=50; i+=2){
            System.out.println(
                    i + " "
            );
        }
        System.out.println("Priniting odd numbers from 1-49");
        for (int i =1; i<50 ; i+=2){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
