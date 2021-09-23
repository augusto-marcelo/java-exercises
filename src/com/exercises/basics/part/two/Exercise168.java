package com.exercises.basics.part.two;

public class Exercise168 {
    /**
     * 168. Write a Java program to multiply two given integers without using the multiply operator(*).
     *
     * Input the first number: 25
     * Input the second number: 5
     * Result: 125 */
    public static void main(String[] args) {
        int x = 25;
        int y = 5;

        int result = oldSchoolMultiply(x, y);
        System.out.println("Result: " + result );

        int result2 = multiply(x, y);
        System.out.println("Result 2: " + result);
    }

    public static int oldSchoolMultiply(int x, int y) {
        int total = 0;
        for(int i = 0; i < y; i++) {
            total += x;
        }

        return total;
    }

    // original solution (TO TEST)
    public static int multiply(int n1, int n2) {
        int result = 0;
        boolean negative_num = (n1 < 0 && n2 >= 0) || (n2 < 0 && n1 >= 0);
        boolean positive_num = !negative_num;
        n1 = Math.abs(n1);
        for (int i = 0; i < n1; i++) {
            if (negative_num && n2 > 0 || positive_num && n2 < 0)
                result -= n2;
            else
                result += n2;
        }

        return result;
    }
}
