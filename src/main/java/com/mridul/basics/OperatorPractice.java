package com.mridul.basics;

import java.util.Scanner;

public class OperatorPractice {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //1. Check whether number is +ve or -ve
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        if (num>0){
            System.out.println(num + " is positive");
        } else if (num<0) {
            System.out.println(num +" is negative");
        } else {
            System.out.println("Number is Zero");
        }
        //2. Check whether a person is eligible to vote
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        //3. Check if a number is even or odd using %
        System.out.println("Enter a number: ");
        int num2 = sc.nextInt();
        if(num2 % 2 == 0){
            System.out.println(num2 + " is even");
        } else {
            System.out.println(num2 + " is odd");
        }
        //4. Check if username is "admin" and password is "admin123"
        sc.nextLine();
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("admin123")){
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid credentials");
        }
        //5. Demonstrate short-circuit evaluation using && and ||
        int x = 10;
        int y = 5;
        //short-cicuit AND(&&)
        if (x>0 && y++ >10){
            System.out.println("Condition true");
        } else {
            System.out.println("Condition false");
        }
        System.out.println("Value of y after &&: "+ y);
        // short-circuit OR ||
        if (x<0 || y++ >2){
            System.out.println("Condition true");
        } else {
            System.out.println("Condition false");
        }
        System.out.println("Value of y after ||: " + y);

        sc.close();
    }
}
