package com.exercises.basics.part.one;

import java.util.Scanner;

public class Exercise62 {

    /**
     * 62. Write a Java program that accepts three integer values and
     * return true if
     *   one of them is 20
     * or
     *   more and less than the substractions of others.
     *
     * Sample Output:
     *
     * Input the first number : 15
     * Input the second number: 20
     * Input the third number : 25
     * false
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Input the first number ");
        int firstNumber = sc.nextInt();

        System.out.printf("Input the second number ");
        int secondNumber = sc.nextInt();

        System.out.printf("Input the third number ");
        int thirdNumber = sc.nextInt();

        System.out.printf(Boolean.toString(compare(firstNumber, secondNumber, thirdNumber)));
    }

    public static boolean compare(int first, int second, int third) {
        if (first >= 20 || second >= 20 || third >= 20) {
            return true;
        } else if (first - second >= third || second - third >= first) {
            return true;
        }

        return false;
    }
}
