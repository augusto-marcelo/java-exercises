package com.exercises;

import java.util.Scanner;

public class Exercise57 {

    /**
     * 57. Write a Java program to accepts an integer and count the factors of the number.
     * Sample Output:
     *
     * Input an integer: 25
     * 3
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input an integer: ");
        int userInput = 25; //sc.nextInt();

        System.out.println("Result: " + result(userInput));

    }

    public static int result(int num) {
        int ctr = 0;
        for(int i=1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0 && i * i != num) {
                ctr += 2;
            } else if (i * i == num) {
                ctr ++;
            }
        }

        return ctr;
    }
}
