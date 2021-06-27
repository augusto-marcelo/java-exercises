package com.exercises.basics.part.two;

public class Exercise164 {
    /**
     * 164. Write a Java program to divide the two given integers using subtraction operator.

     * Expected Output:
     * Input the dividend: 625
     * Input the divider: 25
     * Result: 25.0
     */
    public static void main(String[] args) {
        int dividend = 0;
        int divisor = 0;
        int result = divide(dividend, divisor);

        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        System.out.println("Result: " + result);

    }

    public static int divide(int dividend, int divisor) {

        if (dividend == 0 || divisor == 0)
                return -1;

        int result = 0;

        while(dividend != 0) {
            dividend = dividend - divisor;
            result ++;
        }

        return result;
    }
}
