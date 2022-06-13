package com.exercises.array;

import java.util.Arrays;

public class Exercise30 {
    /**
     * 30. Write a Java program to check if an array of integers without 0 and -1.
     * */
    public static void main(String[] args) {
        int[] testOne = {1, 3, 4};
        int[] testTwo = {0, 1, 3};
        int[] testThree = {-1, 1};

        boolean checkOne = check(testOne);
        boolean checkTwo = check(testTwo);
        boolean checkThree = check(testThree);

        System.out.println("First: " + Arrays.toString(testOne) + " | Result: " + checkOne);
        System.out.println("Second: " + Arrays.toString(testTwo) + " | Result: " + checkTwo);
        System.out.println("Third: " + Arrays.toString(testThree) + " | Result: " + checkThree);
    }

    public static boolean check(int[] array) {
        boolean result = false;

        for(int x: array) {
            if(x == 0 || x == -1) {
                return true;
            }
        }

        return result;
    }
}
