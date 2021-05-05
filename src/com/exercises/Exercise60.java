package com.exercises;

public class Exercise60 {

    /**
     * 60. Write a Java program to find the penultimate (next to last) word of a sentence.
     * Sample Output:
     *
     * Input a String: The quick brown fox jumps over the lazy dog.
     * Penultimate word: lazy
     */
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        String[] splitedString = input.split(" ");

        System.out.println("Input = " + input);
        System.out.println("The penultimate is: " + splitedString[splitedString.length - 2]);
    }
}
