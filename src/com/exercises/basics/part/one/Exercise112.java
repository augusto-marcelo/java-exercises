package com.exercises.basics.part.one;

import java.math.BigInteger;

public class Exercise112 {
    /**
     * 112. Write a Java program to compute the number of trailing zeros in a factorial.
     *
     * 7! = 5040, therefore the output should be 1
     */
    public static void main(String[] args) {
        int n = 5040;
        BigInteger result = calcFactorial(n);
        int quantityOfTrailingZeros = countTrailingZeros(result);

        System.out.println("Number: " + n);
        System.out.println("Factorial: " + result);
        System.out.println("Total zeroes: " + quantityOfTrailingZeros);
    }

    public static BigInteger calcFactorial(int n) {
        int factorial = n;
        BigInteger result = new BigInteger(String.valueOf(factorial));

        while(factorial > 1) {
            result = result.multiply(BigInteger.valueOf(factorial - 1));
            factorial--;
        }

        return result;
    }

    public static int countTrailingZeros(BigInteger n) {
        char[] chars = n.toString().toCharArray();
        int counter = 0;

        for(int i = chars.length - 1; i > 0; i--) {
            if(Character.getNumericValue(chars[i]) != 0) {
                break;
            } else {
                counter++;
            }
        }

        return counter;
    }

}
