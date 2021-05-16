package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise82 {
    /**
     * 82. Write a Java program to find the largest element between first, last, and middle values
     * from an array of integers (even length).
     * Sample Output:
     *
     * Original Array: [20, 30, 40, 50, 67]
     * Largest element between first, last, and middle values: 67
     */
    public static void main(String[] args) {

        int[] originalArray = {20, 30, 40, 50, 67};
        int largest = findLargest(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Largest element between first, last, and middle values: " + largest);

    }

    public static int findLargest(int[] numbers) {
        int first = numbers[0];
        int middle = numbers[(numbers.length - 1) / 2];
        int last = numbers[numbers.length - 1];

        int largest = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return  largest;
    }


}
