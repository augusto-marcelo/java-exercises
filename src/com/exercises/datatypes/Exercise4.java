package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise4 {

    /**
     * 4. Write a Java program to convert minutes into a number of years and days.
     *
     * Test Data
     * Input the number of minutes: 3456789
     * Expected Output :
     * 3456789 minutes is approximately 6 years and 210 days
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double min = sc.nextInt();

        double minutesInYear = 60 * 24 * 365;

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
