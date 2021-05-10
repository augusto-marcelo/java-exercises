package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise92 {

    /**
     * 92. Write a Java program to count the number of even and odd elements in a given array of integers.
     */
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array: " + Arrays.toString(numbers));
        countEvenAndOdd(numbers);

    }

    public static void countEvenAndOdd(int[] numbers) {
        int evenQtty = 0;
        int oddQtty = 0;

        for(int n: numbers){
            if(n % 2 == 0) {
                evenQtty++;
            } else {
                oddQtty++;
            }
        }

        System.out.println("Quantity of evens: " + evenQtty);
        System.out.println("Quantity of odds: " + oddQtty);
    }
}
