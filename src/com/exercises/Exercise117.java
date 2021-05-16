package com.exercises;

public class Exercise117 {
    /**
     * 117. Write a Java program to compute the square root of a given integer. Go to the editor
     * Input a positive integer: 25
     * Square root of 25 is: 5
     */
    public static void main(String[] args) {
        int number = 25;
        double result = squareRoot(number);

        System.out.println(result);
    }

    public static double squareRoot(int n) {
        return Math.sqrt(n);
    }
}
