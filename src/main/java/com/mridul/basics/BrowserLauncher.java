package com.mridul.basics;

import java.util.Scanner;

public class BrowserLauncher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a browser name (chrome/edge/firefox): ");

        String browser = sc.nextLine().toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("Launching Chrome");
                break;

            case "edge":
                System.out.println("Launching Edge");
                break;

            case "firefox":
                System.out.println("Launching Firefox");
                break;

            default:
                System.out.println("Browswer not supported");
        }
        sc.close();


    }
}
