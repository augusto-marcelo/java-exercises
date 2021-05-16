package com.exercises.basics.part.one;

import java.util.Scanner;

public class Exercise52 {

    /**
     * 52. Write a Java program to calculate the sum of two integers and return true if the
     * sum is equal to a third integer. Go to the editor
     * Sample Output:
     *
     * Input the first number : 5
     * Input the second number: 10
     * Input the third number : 15
     * The result is: true
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input the first number: ");
        int firstInt = sc.nextInt();

        System.out.printf("Input the second number: ");
        int secondInt = sc.nextInt();

        System.out.printf("Input the third number: ");
        int thirdInt = sc.nextInt();

        System.out.printf("The result is: " + check(firstInt, secondInt, thirdInt));

    }

    public static boolean check(int first, int second, int guess) {
        return first + second == guess;
    }
}
