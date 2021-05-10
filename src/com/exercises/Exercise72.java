package com.exercises;

public class Exercise72 {

    /**
     * 72. Write a Java program to create a new string taking first three characters
     * from a given string.
     *
     * If the length of the given string is less than 3 use "#" as substitute characters. Go to the editor
     * Test Data: Str1 = " "
     * Sample Output:
     *
     * ###
     */
    public static void main(String[] args) {

        String testData = " ";
        String testDataTwo = "ABCqerqwerqwer";

        System.out.println("Test one: " + transform(testData));
        System.out.println("Test two: " + transform(testDataTwo));
    }

    public static String transform(String text) {
        if(text.length() < 3) {
            return "###";
        } else {
            return text.substring(0, 3);
        }
    }
}
