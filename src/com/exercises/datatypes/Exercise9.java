package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise9 {

    /**
     * 9. Write a Java program that accepts two integers from the user and then prints
     * the sum,
     * the difference,
     * the product,
     * the average,
     * the distance (the difference between integer),
     * the maximum (the larger of the two integers),
     * the minimum (smaller of the two integers).
     *
     * Test Data
     * Input 1st integer: 25
     * Input 2nd integer: 5
     * Expected Output :
     * Sum of two integers: 30
     * Difference of two integers: 20
     * Product of two integers: 125
     * Average of two integers: 15.00
     * Distance of two integers: 20
     * Max integer: 25
     * Min integer: 5
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int firstNum = sc.nextInt();

        System.out.print("Input 2nd integer: ");
        int secondNum = sc.nextInt();

        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        double average = (double) sum / 2;
        int distance = Math.abs(firstNum - secondNum);
        int maximum = (firstNum > secondNum) ? firstNum : secondNum;
        int minimum = (firstNum < secondNum) ? firstNum : secondNum;

        System.out.println();
        System.out.println("Sum of two ints: " + sum);
        System.out.println("Diff of two ints: " + difference);
        System.out.println("Product of two ints: " + product);
        System.out.println("Average of two ints: " + average);
        System.out.println("Distance of two ints: " + distance);
        System.out.println("Max int: " + maximum);
        System.out.println("Min int: " + minimum);
    }
}
