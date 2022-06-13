package com.exercises.array;

import java.util.Arrays;

public class Exercise31 {
    /**
     * 31. Write a Java program to check if the sum of all the 10's in the array is exactly 30.
     * Return false if the condition does not satisfy, otherwise true
     * */
    public static void main(String[] args) {
        int[] numbers = {10, 120, 10, 20};
        int searchNum = 10;
        int expectedSum = 20;

        boolean sumIsExpected = sumIs(numbers, searchNum, expectedSum);

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Num: " + searchNum);
        System.out.println("total: " + expectedSum);
        System.out.println("Sum is equals expectation: " + sumIsExpected);
    }

    public static boolean sumIs(int[] array, int searchNum, int expectedSum) {
        int sum = 0;

        for(int x: array) {
            if(x == searchNum) {
                sum +=x;
            }
        }

        return sum == expectedSum? true : false;
    }
}
