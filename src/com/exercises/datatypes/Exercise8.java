package com.exercises.datatypes;

import java.util.Scanner;

public class Exercise8 {

    /**
     * 8. Write a Java program that reads a number and display the square, cube, and fourth power.
     *
     * Expected Output:
     * Square: .2f
     * Cube: .2f
     * Fourth power: 50625.00
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type a number: ");
        int input = sc.nextInt();

        int square = input * input;
        int cube = input * input * input;
        int fourthPower = input * input * input * input;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);

    }
}
