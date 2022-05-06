package com.exercises.array;

import java.util.Arrays;

public class Exercise2 {

    /**
     * 2. Write a Java program to sum values of an array.
     * */
    public static void main(String[] args) {
        int[] values = {2,3,4,5,6};

        int sum = 0;
        for(int n : values) {
            sum += n;
        }

        System.out.println("Values: " + Arrays.toString(values));
        System.out.println("Sum = " + sum);
    }
}
