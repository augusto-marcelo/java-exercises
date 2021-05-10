package com.exercises;

public class Exercise86 {

    /**
     * 86. Write a Java program start with an integer n,
     * divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
     */
    public static void main(String[] args) {

        int n = 10;

        multiplyOrDivide(n);

    }

    public static void multiplyOrDivide(int n) {
        while(n > 0) {
            if(isEven(n)) {
                System.out.println(n + " is even. Dividing by 2. RESULT = " + n / 2);
            } else {
                System.out.println(n + " is odd. Multiplying by 3. RESULT = " + n * 3);
            }

            n--;
        }
    }

    public static boolean isEven(int y) {
        if(y % 2 == 0) {
            return true;
        }

        return false;
    }
}
