package com.exercises.basics.part.one;

public class Exercise116 {
    /**
     * 116. Write a Java program which iterates the integers from 1 to 100.
     * For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five.
     * When number is divided by both three and five, print "fizz buzz"
     */
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        fizzBuzz(start, end);
    }

    public static void fizzBuzz(int start, int end) {
        for(int i = start; i <= end; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }


}
