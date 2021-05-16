package com.exercises.basics.part.one;

import java.util.Scanner;

public class Exercise51 {

    /**
     * 51. Write a Java program to convert a string to an integer in Java. Go to the editor
     * Sample Output:
     *
     * Input a number(string): 25
     * The integer value is: 25
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Input a number(string): ");
        String userInput = sc.nextLine();

        try {
            Integer userInputConverted = Integer.parseInt(userInput);
            System.out.println("The integer value is: " + userInputConverted.toString());
        } catch (Exception e) {
            System.out.println("Error while converting string to int...");
            throw e;
        }
    }
}
