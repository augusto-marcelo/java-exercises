package com.exercises.basics.part.two;

import java.util.Scanner;

public class Exercise153 {
    /**
     * 153. Write a Java program that accepts two double variables
     * and test if both strictly between 0 and 1 and false otherwise.
     *
     * Sample Output:
     * Input first number: 5
     * Input second number: 1
     * false
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input first number: ");
        double first = sc.nextDouble();

        System.out.printf("Input second number: ");
        double second = sc.nextDouble();

        boolean result = checkRange(first, second);
        System.out.println(result);

    }

    public static boolean checkRange(double first, double second) {
        return (first >= 0 && first <= 1.0)
                &&
               (second >= 0 && second <= 1.0);

    }
}
