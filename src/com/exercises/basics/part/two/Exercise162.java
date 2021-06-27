package com.exercises.basics.part.two;

import java.util.Arrays;
import java.util.Vector;

public class Exercise162 {
    /**
     * 162. Write a Java program to find the numbers greater than the average of the numbers of a given array.
     *
     * Expected Output:
     * Original Array:
     * [1, 4, 17, 7, 25, 3, 100]
     * The average of the said array is: 22.0
     * The numbers in the said array that are greater than the average are:
     * 25
     * 100
     *
     */
    public static void main(String[] args) {
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};

        int avg = findAverage(numbers);

        Vector<Integer> greaterThanAvg = findGreaterThanAvg(numbers, avg);

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Average: " + avg);
        System.out.println("Greater Than Avg: " + greaterThanAvg.toString());

    }

    public static int findAverage(int[] numbers) {
        int arrLength = numbers.length;
        int sum = 0;

        for(int n: numbers) {
            sum = sum + n;
        }

        return sum / arrLength;
    }


    public static Vector<Integer> findGreaterThanAvg(int[] numbers, int avg) {
        Vector<Integer> result = new Vector<Integer>();

        for(int n: numbers) {
            if(n > avg) {
                result.add(n);
            }
        }

        return result;
    }
}
