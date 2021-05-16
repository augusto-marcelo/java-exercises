package com.exercises.basics.part.one;

public class Exercise37 {

    /**
     * 37. Write a Java program to reverse a string. Go to the editor
     * Input Data:
     * Input a string: The quick brown fox
     * Expected Output
     *
     * Reverse string: xof nworb kciuq ehT
     */
    public static void main(String[] args) {

        String test = "The quick brown fox";

        System.out.println("Original: " + test);
        System.out.println("Reversed: " + reverseString(test));

    }

    public static String reverseString(String str) {
        String reversed = "";

        char chr[] = str.toCharArray();

        for(int i = chr.length - 1; i >= 0; i--) {
            reversed += chr[i];
        }

        return reversed;
    }
}
