package com.exercises;

public class Exercise32 {

    /**
     * 32. Write a Java program to compare two numbers.
     *
     * Input Data:
     * Input first integer: 25
     * Input second integer: 39
     * Expected Output
     *
     * 25 != 39
     * 25 < 39
     * 25 <= 39
     */
    public static void main(String[] args) {

        Integer firstInt = new Integer(25);
        Integer secondInt = new Integer(39);

        System.out.println("25 != 39: " + Boolean.toString(firstInt != secondInt));
        System.out.println("25 < 39: " + Boolean.toString(firstInt < secondInt));
        System.out.println("25 <= 39: " + Boolean.toString(firstInt <= secondInt));
    }
}
