package com.exercises;

import java.util.Scanner;

public class Exercise33 {

    /**
     * 33. Write a Java program and compute the sum of the digits of an integer.
     *
     * Input Data:
     * Input an integer: 25
     * Expected Output
     *
     * The sum of the digits is: 7
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input an integer: ");
        Integer userInput = sc.nextInt();

        Integer sum = 0;
        for (Character chr: userInput.toString().toCharArray() ) {
            sum += Integer.valueOf(chr.toString());
        }

        System.out.println("The sum of the digits is: " + sum.toString());


    }
}
