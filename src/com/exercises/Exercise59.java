package com.exercises;

import java.util.Locale;

public class Exercise59 {

    /**
     * 59. Write a Java program to convert a given string into lowercase.
     * Sample Output:
     *
     * Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     * the quick brown fox jumps over the lazy dog.
     */
    public static void main(String[] args) {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

        System.out.println("Input String = " + input);
        System.out.println("To lower case = " + input.toLowerCase());
    }
}
