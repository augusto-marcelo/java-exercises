package com.exercises;

import java.util.Arrays;

public class Exercise97 {
    /**
     * 97. Write a Java program to check if an array of integers contains a specified number next
     * to each other or there are two same specified numbers separated by one element.
     */
    public static void main(String[] args) {

        int specifiedNumber = 10;
        int[] numbers = {20, 20, 20, 20, 30, 20, 10};
        boolean result = check(specifiedNumber, numbers);

        System.out.println("Specified Number: " + specifiedNumber);
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Result: " + String.valueOf(result));

    }

    public static boolean check(int specifiedNumber, int[] numbers) {
        for(int n = 0; n < numbers.length; n++) {
            if(n < numbers.length - 2) {
                if(numbers[n] == specifiedNumber && numbers[n + 2] == specifiedNumber) {
                    return true;
                }
            } else if (n < numbers.length - 1
                    && numbers[n] == specifiedNumber
                    && numbers[n + 1] == specifiedNumber) {

                return true;
            }
        }

        return false;
    }
}
