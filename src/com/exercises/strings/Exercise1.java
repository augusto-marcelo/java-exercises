package com.exercises.strings;

public class Exercise1 {
    /**
     * 1. Write a Java program to get the character at the given index within the String.
     *
     * Original String = Java Exercises!
     * The character at position 0 is J
     * The character at position 10 is i
     */
    public static void main(String[] args) {
        String text = "Java Exercises!";

        char zero = getChar(text, 0);
        char ten = getChar(text, 10);

        System.out.println("Original String = " + text);
        System.out.println("Char at index 0 is " + zero);
        System.out.println("Char at index 10 is " + ten);


    }

    public static char getChar(String text, int index) {
        char[] chars = text.toCharArray();

        return chars[index];
    }
}
