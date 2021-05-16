package com.exercises.basics.part.one;

import java.util.Scanner;

public class Exercise53 {

    /**
     * 53. Write a Java program that accepts three integers from the user and return true if
     * the second number is greater than first number and third number is greater than second number.
     *
     * If "abc" is true second number does not need to be greater than first number. Go to the editor
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

        System.out.println("The result is: " + check(firstInt, secondInt, thirdInt, true));
    }

    public static boolean check(int first, int second, int third, boolean abc) {
        if(abc)
            return third > second;

        return second > first && third > second;
    }
}
