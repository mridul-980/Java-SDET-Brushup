package com.mridul.strings;

public class StringBasics {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1;

        s1 = s1.concat(" SDET");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        String a = "SDET";
        String b = "SDET";

        String c = new String("SDET");
        String d = new String("SDET");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}
