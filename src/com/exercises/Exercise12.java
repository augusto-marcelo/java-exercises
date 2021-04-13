package com.exercises;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        /*
        12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        */

        Scanner sc = new Scanner(System.in);

        System.out.printf("Type the first number: ");
        int firstInput = sc.nextInt();

        //System.out.println();
        System.out.printf("Type the second number: ");
        int secondInput = sc.nextInt();

        //System.out.println();
        System.out.printf("Type the third number: ");
        int thirdInput = sc.nextInt();

        Double average = (firstInput + secondInput + thirdInput) / 3.0;

        System.out.println();
        System.out.printf("The average is: " + average.toString());
    }
}
