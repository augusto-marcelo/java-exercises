package com.exercises.basics.part.one;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise94 {

    /**
     * 94. Write a Java program to rearrange all the elements
     * of a given array of integers so that all the odd numbers come before all the even numbers.
     */
    public static void main(String[] args) {

        int[] originalArray = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        ArrayList<Integer> rearranged = rearrange(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array: " + rearranged.toString());
    }

    public static ArrayList<Integer> rearrange(int[] numbers) {
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();


        for(int num: numbers) {
            if(num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        for(int o: odds) {
            result.add(o);
        }

        for(int e: evens) {
            result.add(e);
        }


        return result;
    }
}
