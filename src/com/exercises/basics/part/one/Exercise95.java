package com.exercises.basics.part.one;

import java.util.Arrays;

public class Exercise95 {
    /**
     * 95. Write a Java program to create an array (length # 0)
     * of string values. The elements will contain "0", "1", "2" … through ... n-1.
     */
    public static void main(String[] args) {

        int n = 10;
        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            result[i] = Integer.toString(i);
        }

        System.out.println(Arrays.toString(result));
    }
}
