package com.exercises;

import java.util.Scanner;

public class Exercise17 {

    // [NEED TO WORK ON THIS AND UNDERSTAND BETTER]
    /*
    17. Write a Java program to add two binary numbers. Go to the editor
        Input Data:
        Input first binary number: 10
        Input second binary number: 11
        Expected Output
    */
    public static void main(String[] args) {

        System.out.println("Input data:");

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input first binary number: ");
        Long firstBinary = 10l; //sc.nextLong();

        System.out.printf("Input second binary number: ");
        Long secondBinary = 11l; //sc.nextLong();

        String result = addBinary(firstBinary, secondBinary);
        System.out.println("Sum of two binary numbers: " + result);
    }

    public static String addBinary(long x, long y) {
        System.out.println("Summing up x and y");

        String result = "";

        // initialize digit sum
        int s = 0;

        String firstBinary = Long.toString(x);
        String secondBinary = Long.toString(y);

        //Traverse both strings starting
        // from last characters
        int i = firstBinary.length() - 1, j = secondBinary.length() - 1;
        while(i >= 0 || j >= 0 || s == 1){
            // comput sum of last digits
            // and carry
            s += ((i >= 0)? firstBinary.charAt(i) - '0': 0);
            s += ((j >= 0)? secondBinary.charAt(j) - '0': 0);

            // if current digit sum is
            // 1 or 3, add 1 to result
            result = (char)(s % 2 + '0') + result;

            // compute carry
            s /= 2;

            // move to next digits
            i--; j--;
        }

        return result;
    }
}
