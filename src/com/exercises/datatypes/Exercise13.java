package com.exercises.datatypes;

public class Exercise13 {

    /**
     * 13. Write a Java program to compute the floor division and the floor modulus of the given dividend and divisor.
     */
    public static void main(String[] args) {

        int dividend = -2365;
        int divisor = 125;

        int floorDivisionResult = dividend / divisor;
        int modulusDivisionResult = dividend % divisor;

        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        System.out.println("Floor div result = " + floorDivisionResult);
        System.out.println("Modulus div result = " + modulusDivisionResult);
    }

}
