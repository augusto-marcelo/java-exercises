package com.exercises.basics.part.one;

public class Exercise108 {
    /**
     * 108. Write a Java program to add all the digits
     * of a given positive integer until the result has a single digit.
     */
    public static void main(String[] args) {
        int testData = 0;
        int result = sumUntilSingleDigit(testData);

        System.out.println("Original: " + testData);
        System.out.println("Result: " + result);
        System.out.println("Oficial answer: " + oficialAnswer(testData));
    }

    public static int sumUntilSingleDigit(int number) {
        char[] numberSplit = Integer.toString(number).toCharArray();
        int partial = number;

        while (partial > 9) {
            partial = 0;
            for(char n: numberSplit) {
                partial += Integer.valueOf(String.valueOf(n));
            }

            numberSplit = Integer.toString(partial).toCharArray();
        }

        return partial;
    }

    public static int oficialAnswer(int n) {
        return (n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9));
    }
}
