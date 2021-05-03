package com.exercises;

import java.util.Scanner;

public class Exercise35 {

    /**
     * 35. Write a Java program to compute the area of a polygon. Go to the editor
     * Area of a polygon = (n*s^2)/(4*tan(π/n))
     * where n is n-sided polygon and s is the length of a side
     * Input Data:
     * Input the number of sides on the polygon: 7
     * Input the length of one of the sides: 6
     * Expected Output
     *
     * The area is: 130.82084798405722
     */
    public static void main(String[] args) {
        double areaOfaPolygon = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Input the number of sides on the polygon: ");
        int qttySides = sc.nextInt();

        System.out.printf("Input the length of one of the sides: : ");
        int sideLength = sc.nextInt();

        double area = (qttySides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / qttySides));

        System.out.println("The area is: " + area);

    }
}
