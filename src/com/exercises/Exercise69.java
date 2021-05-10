package com.exercises;

public class Exercise69 {

    /**
     * 69. Write a Java program to extract the first half of a string of even length.
     * Test Data: Python
     * Sample Output:
     * Pyt
     */
    public static void main(String[] args) {
        String testData = "Python";

        System.out.println("Original: " + testData);
        System.out.println("Half: " + extractFirstHalf(testData));
    }

    public static String extractFirstHalf(String text) {
        int middle = text.length() / 2;
        String half = text.substring(0, middle);

        return half;
    }
}
