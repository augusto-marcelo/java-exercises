package com.exercises;

import java.util.Scanner;

public class Exercise65 {

    /**
     * 65. Write a Java program to calculate the modules of two numbers
     * without using any inbuilt modulus operator.
     * Sample Output:
     *
     * Input the first number : 19
     * Input the second number: 7
     * 5
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input the first number: ");
        int number = sc.nextInt();

        System.out.printf("Input the divisor number: ");
        int divisor = sc.nextInt();

        System.out.println(mod(number, divisor));

    }

    public static int mod(int number, int divisor) {

        if (number <= 0) {
            return 0;
        }

        int quotient = number / divisor;

        int partial = divisor * quotient;

        return number - partial;
    }
}
