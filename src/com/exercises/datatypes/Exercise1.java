package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise1 {
    /**
     * 1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
     * Test Data
     * Input a degree in Fahrenheit: 212
     * Expected Output:
     * 212.0 degree Fahrenheit is equal to 100.0 in Celsius
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fah = scanner.nextDouble();

        double celsius = convertToCelsius(fah);

        System.out.println(fah + " degree Fahrenheit is equal to " + celsius + " in Celsius");

    }

    public static double convertToCelsius(double fahDegrees) {
        return (fahDegrees - 32) * 0.5556;
    }

}
