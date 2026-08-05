package com.mridul.basics;

import java.util.Scanner;

public class ModernSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter browser name (chrome/edge/firefox): ");
        String browser = sc.nextLine().toLowerCase();

        // Modern switch expression
        String message = switch (browser){
            case "chrome" -> "Launching Google Chrome....";
            case "firefox" -> "Launching Firefox....";
            case "edge" -> "Launching Edge....";
            default -> "Unknown browser!";
        } ;
        System.out.println(message);

        sc.close();
    }

}
