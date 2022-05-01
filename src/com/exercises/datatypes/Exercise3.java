package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise3 {
    /**
     * 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
     *
     * Test Data
     * Input an integer between 0 and 1000: 565
     * Expected Output :
     * The sum of all digits in 565 is 16
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, provide an integer: ");
        int inputNumber = scanner.nextInt();

        int result = sumOfAll(inputNumber);

        System.out.println("The sum of all digitas in " + inputNumber + " is " + result);
    }

    public static int sumOfAll(int num) {
        if (num < 0 || num > 1000) {
            return 0;
        }

        String number = String.valueOf(num);
        int temp = 0;

        for (char i: number.toCharArray()) {
            temp += Character.getNumericValue(i);
        }

        return temp;
    }
}
