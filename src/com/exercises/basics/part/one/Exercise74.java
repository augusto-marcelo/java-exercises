package com.exercises.basics.part.one;

public class Exercise74 {
    /**
     * v74. Write a Java program to test if 10 appears as either the first
     * or last element of an array of integers.
     *
     * The length of the array must be greater than or equal to 2. Go to the editor
     * Sample Output:
     * Test Data: array = 10, -20, 0, 30, 40, 60, 10
     *
     * true
     */
    public static void main(String[] args) {

        int[] numbers = {10, -20, 0, 30, 40, 60, 10};

        System.out.println(checkTens(numbers));

    }

    public static boolean checkTens(int[] numbers) {
        if(numbers.length < 2) {
            return false;
        }

        if(numbers[0] == 10 || numbers[numbers.length - 1] == 10) {
            return true;
        }

        return false;
    }
}
