package com.exercises.basics.part.two;

public class Exercise172 {
    /**
     * 172. Write a Java program to get the number of element in a given array of integers
     * that are smaller than the integer of another given array of integers.
     *
     * Expected Output:
     * 0
     * 3
     * 7
     */
    public static int getQttySmallerElements(int[] arrOne, int[] arrTwo) {
        int qtty = 0;

        for (int i=0; i < arrOne.length; i++) {
            if(arrTwo[i] < arrOne[i]) {
                qtty++;
            }
        }

        return qtty;
    }

    public static void main(String[] args) {
        int[] arrOne = {5, 6, 8, 29};
        int[] arrTwo = {5, 3, 8, 28};

        int result = getQttySmallerElements(arrOne, arrTwo);
        System.out.println(result);
    }
}
