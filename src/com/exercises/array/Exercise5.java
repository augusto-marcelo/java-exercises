package com.exercises.array;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

public class Exercise5 {
    /**
     * 5. Write a Java program to test if an array contains a specific value.
     * */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int value = 4;

        boolean exists = findValue(value, numbers);

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Exists: " + Boolean.toString(exists));
    }

    public static boolean findValue(int value, int[] array) {
        for(int n: array) {
            if (n == value) {
                return true;
            }
        }

        return false;
    }
}
