package com.mridul.basics;

import java.util.Scanner;

public class VotingEligibility {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter age: ");
      int age = sc.nextInt();
      if (age>=20){
          System.out.println("Eligible for voting");
      } else {
          System.out.println("Not eligible");
      }
    }
}
