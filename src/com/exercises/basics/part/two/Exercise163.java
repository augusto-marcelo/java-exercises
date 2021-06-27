package com.exercises.basics.part.two;

public class Exercise163 {
    /**
     * 163. Write a Java program that will accept an integer and convert it into a binary representation.
     * Now count the number of bits which is equal to zero of the said binary representation.
     *
     * Expected Output:
     * Input first number: 25
     * Binary representation of 25 is: 11001
     * Number of zero bits: 2
     */
    public static void main(String[] args) {
        int number = 25;
        String binaryString = binaryRepresentation(number);
        int qttyOfZeroes = countZeroesInBinaryString(binaryString);

        System.out.println("Number: " + number);
        System.out.println("Binary String: " + binaryString);
        System.out.println("Quantity of Zeros: " + qttyOfZeroes);
    }

    public static String binaryRepresentation(int n) {
        return Integer.toBinaryString(n);
    }

    public static int countZeroesInBinaryString(String binaryRepresentation) {
        int qtty = 0;

        for(Character c: binaryRepresentation.toCharArray()) {
            if(c.toString().equals("0")) {
                qtty++;
            }
        }

        return qtty;
    }
}
