package com.exercises.array;

import java.util.Arrays;

public class Exercise1 {

    /**
     * 1. Write a Java program to sort a numeric array and a string array
     * */
    public static void main(String[] args) {
        int[] numericArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] stringArray = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("Original Numeric array: " + Arrays.toString(numericArray));
        System.out.println("Original String array: " + Arrays.toString(stringArray));
        System.out.println();

        Arrays.sort(numericArray);
        Arrays.sort(stringArray);

        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}
