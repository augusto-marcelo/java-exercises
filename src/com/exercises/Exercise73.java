package com.exercises;

public class Exercise73 {

    /**
     * 73. Write a Java program to create a new string taking first
     * and last characters from two given strings.
     *
     * If the length of either string is 0 use "#" for missing character. Go to the editor
     * Test Data:
     *
     * str1 = "Python"
     * str2 = " "
     * Sample Output:
     *
     * P#
     */
    public static void main(String[] args) {

        String str1 = "Python";
        String str2 = "";

        System.out.println(transform(str1, str2));
    }

    public static String transform(String one, String two) {
        one = one.length() < 1 ? "#": one;
        two = two.length() < 1 ? "#": two;

        return one.substring(0, 1) + two.substring(two.length() - 1);
    }
}
