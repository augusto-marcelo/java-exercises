package com.exercises;

public class Exercise111 {
    /**
     * 111. Write a Java program to add two numbers without using any arithmetic operators.
     * Given x = 10 and y = 12; result = 22
     */
    public static void main(String[] args) {
        int first = 10;
        int second = 12;

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Sum: " + add(first, second));

    }

    public static int add(int first, int second) {
        int carry;
        while (second != 0) {
            carry = first & second;
            first = first ^ second;
            second = carry << 1;
        }

        return first;
    }
}
