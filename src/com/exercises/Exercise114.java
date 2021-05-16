package com.exercises;

public class Exercise114 {
    /**
     * 114. Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right).
     */
    public static void main(String[] args) {

        String testData = "abcde";
        int offset = 3;

        String result = rotate(testData, offset);

        System.out.println("Original: " + testData);
        System.out.println("Offset: " + offset);

        System.out.println("Rotated: " + result);

    }

    public static String rotate(String text, int offset) {
        String newText;
        String subStringToShiftLeft = text.substring(offset - 1);
        String subStringToShiftRight = text.substring(0, offset - 1);
        newText = subStringToShiftLeft + subStringToShiftRight;

        return newText;
    }
}
