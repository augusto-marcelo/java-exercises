package com.exercises;

import java.util.Scanner;

public class Exercise2 {

    // Status: COMPLETED
    /*
    * 2. Write a Java program to print the sum of two numbers. Go to the editor
    * Test Data: 74 + 36
    * Expected Output : 110
    */
    public static void main(String[] args) throws Exception {

        System.out.printf("Type the first number to do the addtion: ");
        Scanner sc = new Scanner(System.in);
        String firstNumber = sc.nextLine();

        System.out.println("....");

        System.out.printf("Type the second number to do the addtion: ");
        //Scanner sc = new Scanner(System.in);
        String secondNumber = sc.nextLine();

         Long result = sum(Long.parseLong(firstNumber), Long.parseLong(secondNumber));

         System.out.println("The result is: " + result.toString());


    }

    private static long sum(long x, long y) {
        return x + y;
    }
}
