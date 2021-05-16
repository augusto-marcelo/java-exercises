package com.exercises.basics.part.one;


import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        // STATUS = DONE
        /*
        11. Write a Java program to print the area and perimeter of a circle.
        */

        // TIP 1: The area of a circle is pi times the radius squared (A = π r²).
        // TIP 2: The perimeter of a circle can be calculated by Pi x (2 x radius) = C or 3.14 x (2 x r) = C.
        double pi = Math.PI;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Type the radius: ");
        double radius = sc.nextDouble();

        double area = pi * Math.pow(radius, 2);
        double perimeter = pi * (radius * 2);

        System.out.printf("The area is equals to = " + area);
        System.out.println();
        System.out.printf("The perimeter is equals to = " + perimeter);
    }
}
