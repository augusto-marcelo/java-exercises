package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise6 {

    /**
     * 6. Write a Java program to compute body mass index (BMI).
     *
     * Test Data
     * Input weight in pounds: 452
     * Input height in inches: 72
     *
     * Expected Output:
     * Body Mass Index is 61.30159143458721
     *
     * Body Mass Index, or BMI, is a measurement of body fat based on height and weight.
     * It can be calculated using pounds and inches:
     * BMI = (weight in pounds x 703) / (height in inches x height in inches).
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Input the height in inches: ");
        double height = sc.nextDouble();

        double bmi = (pounds * 703) / (height * height);

        System.out.println("Body Mass Index is: " + Math.round(bmi) );
    }
}
