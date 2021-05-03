package com.exercises;

import java.util.Scanner;

public class Exercise44 {

    /**
     * 44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
     * Sample Output:
     *
     * Input number: 5
     * 5 + 55  + 555
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input an integer: ");
        int userInput = sc.nextInt();

        int total = userInput + userInput * 11 + userInput * 111;
        System.out.printf("The sum of " + userInput + " + " + userInput * 11 + " + " + userInput * 111 + " is: " + total);

    }
}
