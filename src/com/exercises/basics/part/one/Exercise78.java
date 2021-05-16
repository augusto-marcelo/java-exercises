package com.exercises.basics.part.one;

public class Exercise78 {

    /**
     * 78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
     * Sample Output:
     *
     * Original Array: [5, 7]
     * true
     */
    public static void main(String[] args) {
        int[] numbers = {5, 7};

        System.out.println(checkExistence(numbers));
    }

    public static boolean checkExistence(int[] numbers) {
        for(int num: numbers) {
            if (num == 4 || num == 7) {
                return true;
            }
        }

        return false;
    }
}
