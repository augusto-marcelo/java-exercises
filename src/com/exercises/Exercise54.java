package com.exercises;

import java.util.Scanner;

public class Exercise54 {

    /**
     * 54. Write a Java program that accepts three integers from the user and return true if
     * two or more of them (integers ) have the same rightmost digit.
     * The integers are non-negative. Go to the editor
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

        System.out.println("The result is: " + testLastDigit(firstInt, secondInt, thirdInt, true));
    }

    public static boolean testLastDigit(int first, int second, int third, boolean xyz) {
        return (first % 10 == second % 10) || (first % 10 == third % 10) || (second % 10 == third % 10);
    }
}
