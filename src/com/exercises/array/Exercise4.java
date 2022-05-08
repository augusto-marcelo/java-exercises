package com.exercises.array;

import java.util.Arrays;

public class Exercise4 {

    /**
     * 4. Write a Java program to calculate the average value of array elements.
     * */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int avg = 0;
        int sum = 0;

        for(int n: numbers) {
            sum += n;
        }

        avg = sum / numbers.length;

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Average: " + avg);

    }
}
