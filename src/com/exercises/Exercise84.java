package com.exercises;

public class Exercise84 {
    /**
     * 84. Write a Java program to take the last three characters from a given string and
     * add the three characters at both the front and back of the string.
     *
     * String length must be greater than three and more.
     * Test data: "Python"
     *  will be "honPythonhon"
     * Sample Output:
     *
     * honPythonhon
     */
    public static void main(String[] args) {

        String testData = "Python";
        String result = transform(testData);

        System.out.println("Original: " + testData);
        System.out.println("Transformed: " + result);

    }

    public static String transform(String text) {
        if(text.length() >= 3) {
            String lastThree = text.substring(text.length() - 3);
            String newText = lastThree + text + lastThree;

            return newText;
        }

        return "";
    }
}
