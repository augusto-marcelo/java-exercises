package com.exercises;

public class Exercise109 {
    /**
     * 109. Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.
     */
    public static void main(String[] args) {
        int n = 4;

        if(n > 0) {
            System.out.println("Number of rows: " + ((int)((Math.sqrt(8 * (long) n+ 1) - 1) / 2)));
        }

    }
}
