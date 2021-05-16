package com.exercises.basics.part.one;

import java.util.Scanner;

public class Exercise5 {

    /*
     Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Input first number: ");
        double firstNumber = sc.nextDouble();

        System.out.printf("Input second number: ");
        double secondNumber = sc.nextDouble();

        System.out.println("Result = " + Double.toString(firstNumber * secondNumber));

    }
}
