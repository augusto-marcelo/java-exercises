package com.exercises.basics.part.one;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        // STATUS = DONE
        /*
        13. Write a Java program to print the area and perimeter of a rectangle.
        */

        // TIP 1: Triangle area formula -> area = 0.5 * b * h
        // TIP 2: To calculate the perimeter of a triangle, add the length of its sides.
        // For example, if a triangle has sides a, b, and c, then the perimeter of that triangle will be P = a + b + c.
        String[] tests = new String[199];

        System.out.println("Program to print the Area & Perimeter of triangle");

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculating the area");

        System.out.printf("Type the base length: ");
        double base = sc.nextDouble();

        System.out.printf("Type the Height length ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.printf("The area is equals to: " + area);

        System.out.printf("...");
        System.out.printf("Now the Perimeter");

        System.out.printf("Type the first side length");
        double sideA = sc.nextDouble();

        System.out.printf("Type the second side length");
        double sideB = sc.nextDouble();

        System.out.printf("Type the third side length");
        double sideC = sc.nextDouble();

        double perimeter = sideA + sideB + sideC;

        System.out.printf("The Perimeter is equals to: " + perimeter);
    }
}
