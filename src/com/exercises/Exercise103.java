package com.exercises;

import java.util.Arrays;

public class Exercise103 {
    /**
     * 103. Write a Java program to create a new array from a given array of integers,
     * new array will contain the elements from the given array after the last element value 10.
     */
    public static void main(String[] args) {
        int[] numbers = {11, 10, 13, 10, 45, 20, 33, 53};
        int[] result = transform(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Result: " + Arrays.toString(result));

    }

    public static int[] transform(int[] numbers) {
        int lastTenIndex = 0;

        for(int i = numbers.length - 1 ; i > 0; i--) {
            if(numbers[i] == 10) {
                lastTenIndex = i;
                break;
            }
        }

        int[] newArray = new int[numbers.length - lastTenIndex];

        for(int n = 0; n < (numbers.length - lastTenIndex); n++) {
            newArray[n] = numbers[lastTenIndex + n];
        }

        return newArray;

    }
}
