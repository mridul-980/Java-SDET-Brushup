package com.mridul.basics;

public class OperatorDemo {
    public  static void main (String[] args){
        int x = 10;
        int y = 3;
        // Arithmetic operators
        int sum = x+y;
        System.out.println(sum);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        // Assignment operators =,+=,-=,*=,/=,%=
        x += 10;
        System.out.println(x);
        x -= 5;
        System.out.println(x);
        x %= 2;
        System.out.println(x);
        x *= 4;
        System.out.println(x);

        int a =5;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        int b =20;
        System.out.println(b++); //20
        System.out.println(b);   //21

        System.out.println(++b);  //22
        System.out.println(b);    //22

    }
}
