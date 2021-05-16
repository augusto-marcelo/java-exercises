package com.exercises.basics.part.one;

import java.util.Scanner;

public class Exercise49 {

    /**
     * 49. Write a Java program to accept a number and check the number is even or not.
     * Prints 1 if the number is even or 0 if the number is odd. Go to the editor
     * Sample Output:
     *
     * Input a number: 20
     * 1
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input a number: ");
        int userInput = sc.nextInt();

        if(userInput % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
