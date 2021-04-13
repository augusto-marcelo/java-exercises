package com.exercises;

import java.util.Scanner;

public class Exercise3 {

    // Status: COMPLETED
    /*
    * 3. Write a Java program to divide two numbers and print on the screen. Go to the editor
    * Test Data : 50/3
    * Expected Output : 16
    * */
    public static void main(String[] args) {
        double x = 35;
        double y = 7;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Type the dividend: ");
        double dividend = sc.nextDouble();

        System.out.printf("Type the divisor: ");
        double divisor = sc.nextDouble();

        double result = divideNumbers(dividend, divisor);
        System.out.printf("Result: " + Double.toString(result));
    }

    public static double divideNumbers(double x, double y) {
        return x / y;
    }
}
