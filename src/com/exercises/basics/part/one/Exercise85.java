package com.exercises.basics.part.one;

public class Exercise85 {
    /**
     * 85. Write a Java program to check if a string starts with a specified word.
     * Sample Data: string1 = "Hello how are you?"
     * Sample Output:
     */
    public static void main(String[] args) {

        String testData = "Hello how are you?";
        boolean result = startWith(testData, "Hello");

        System.out.println(result);
    }

    public static boolean startWith(String text, String test) {
        return text.startsWith(test);
    }
}
