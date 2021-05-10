package com.exercises;

public class Exercise76 {

    /**
     * 76. Write a Java program to test if the first and the last element of two array of integers are same.
     * The length of the array must be greater than or equal to 2. Go to the editor
     * Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
     * array2 = 45, 20, 10, 20, 30, 50, 11
     * Sample Output:
     *
     * false
     */
    public static void main(String[] args) {
        int[] arrayOne = {50, -20, 0, 30, 40, 60, 12};
        int[] arrayTwo = {45, 20, 10, 20, 30, 50, 11};

        System.out.println(testEquals(arrayOne, arrayTwo));
    }

    public static boolean testEquals(int[] arrayOne, int[] arrayTwo) {
        if(arrayOne.length >= 2 && arrayTwo.length >= 2) {
            boolean testFirsts = arrayOne[0] == arrayTwo[0];
            boolean testLasts = arrayOne[arrayOne.length - 1] == arrayTwo[arrayTwo.length - 1];

            return testFirsts && testLasts;
        }

        return false;
    }
}
