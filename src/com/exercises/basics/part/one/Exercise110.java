package com.exercises.basics.part.one;

public class Exercise110 {
    /**
     * 110. Write a Java program to check whether a given integer is a power of 4 or not.
     * Given num = 64, return true. Given num = 6, return false.
     */
    public static void main(String[] args) {
        int testOne = 64;
        int testTwo = 6;

        System.out.println("Test One: " + testOne);
        System.out.println("Result: " + isPowerOfFouw(testOne));

        System.out.println();
        System.out.println("Test Two: " + testTwo);
        System.out.println("Result: " + isPowerOfFouw(testTwo));


    }

    public static boolean isPowerOfFouw(int n) {
        return n % 4 == 0;
    }
}
