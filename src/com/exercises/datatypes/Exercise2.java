package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise2 {
    /**
     * 2. Write a Java program that reads a number in inches, converts it to meters.
     * Note: One inch is 0.0254 meter.
     * Test Data
     * Input a value for inch: 1000
     * Expected Output :
     * 1000.0 inch is 25.4 meters
     */
    public static double convertToMeters(double inches) {
        return inches * 0.0254;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inches: ");
        double inches = scanner.nextDouble();

        double meters = convertToMeters(inches);

        System.out.println(inches + " inches is equals to " + meters + " meters");
    }
}