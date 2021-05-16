package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise104 {
    /**
     * 104. Write a Java program to create a new array from a given array of integers,
     * new array will contain the elements from the given array before the last element value 10.
     */
    public static void main(String[] args) {
        int[] numbers = {11, 15, 13, 10, 45, 20, 33, 53};
        int[] result = transform(numbers);

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Result: " + Arrays.toString(result));

    }

    public static int[] transform(int[] numbers) {
        int[] newArray;

        int lastTenIndex = numbers.length - 1;
        while(numbers[lastTenIndex] != 10) {
            if(lastTenIndex < 0) {
                break;
            }

            lastTenIndex--;
        }

        newArray = new int[lastTenIndex  + 1];

        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = numbers[i];
        }

        return newArray;
    }
}
