package com.exercises;

import java.util.Scanner;

public class Exercise63 {

    /**
     * 63. Write a Java program that
     * accepts two integer values from the user and
     *  return the larger values.
     *  However if the two values are the same, return 0 and
     *  return the smaller value if the two values have the same remainder when divided by 6.
     *
     * Sample Output:
     *
     * Input the first number : 12
     * Input the second number: 13
     * Result: 13
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Type the first number: ");
        int firstNumber = sc.nextInt();

        System.out.printf("Now the second: ");
        int secondNumber = sc.nextInt();

        System.out.println(check(firstNumber, secondNumber));
    }

    public static int check(int first, int second) {
        int smaller = 0;
        int greater = 0;

        if(first > second) {
            greater = first;
            smaller = second;
        } else {
            greater = second;
            smaller = first;
        }

        if(first == second) {
            return 0;
        } else if (first % 6 == second % 6) {
            return smaller;
        } else {
            return greater;
        }
    }
}
