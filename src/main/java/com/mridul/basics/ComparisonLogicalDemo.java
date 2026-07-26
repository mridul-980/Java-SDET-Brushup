package com.mridul.basics;

public class ComparisonLogicalDemo {
    public static void main (String[] args){
        int a = 10;
        System.out.println(a>5);
        System.out.println(a<5);
        System.out.println(a==10);
        System.out.println(a != 20);
        System.out.println(a>5 && 20>15);
        System.out.println( a<5 || 20>15);
        System.out.println(!(a>5));
    }
}
