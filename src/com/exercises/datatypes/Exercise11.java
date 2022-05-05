package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise11 {

    /**
     * 11. Write a Java program to test whether a given double/float value
     * is a finite floating-point value or not.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double userInput = sc.nextDouble();

        boolean result = Double.isFinite(userInput);

        System.out.println(userInput + " is finite? " + result);

    }
}
