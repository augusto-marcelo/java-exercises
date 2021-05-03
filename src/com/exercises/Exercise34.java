package com.exercises;

import java.util.Scanner;

public class Exercise34 {

    /**
     * 34. Write a Java program to compute the area of a hexagon. Go to the editor
     * Area of a hexagon = (6 * s^2)/(4*tan(π/6))
     * where s is the length of a side
     * Input Data:
     * Input the length of a side of the hexagon: 6
     * Expected Output
     *
     * The area of the hexagon is: 93.53074360871938
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Input the length of a side of the hexagon: ");
        double length = sc.nextDouble();

        double area = (6 * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is: " + area);
    }
}
