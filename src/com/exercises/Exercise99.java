package com.exercises;

import java.util.Arrays;

public class Exercise99 {
    /**
     * 99. Write a Java program to check if a
     * specified number appears in every pair of adjacent element of a given array of integers.
     */
    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 20, 40, 20, 50};
        int givenNumber = 20;
        boolean result = isAdjacent(givenNumber, numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Given Number: " + givenNumber);
        System.out.println("Result: " + result);


    }

    public static boolean isAdjacent(int givenNumber, int[] numbers) {
        boolean check = true;

        for(int num = 0; num < numbers.length - 1; num+= 2) {
            if(numbers[num + 1] != givenNumber) {
                check = false;
                return check;
            }
        }

        return check;
    }
}
