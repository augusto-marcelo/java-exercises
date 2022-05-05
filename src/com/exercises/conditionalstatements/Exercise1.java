package com.exercises.conditionalstatements;

import java.util.Scanner;

public class Exercise1 {
    /**
     * Write a Java program to get a number from the user and print whether it is positive or negative.
     *
     * Test Data
     * Input number: 35
     * Expected Output :
     * Number is positive
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number: ");
        int userInput = sc.nextInt();

        if(userInput > 0) {
            System.out.println("Number is positive");
        } else if (userInput < 0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

}
