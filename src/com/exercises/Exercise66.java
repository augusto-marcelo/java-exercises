package com.exercises;

public class Exercise66 {
    /**
     * 66. Write a Java program to compute the sum of the first 100 prime numbers.
     * Sample Output:
     *
     * Sum of the first 100 prime numbers: 24133
     */
    public static void main(String[] args) {
        int sum = 1;
        int ctr = 0;
        int n = 0;

        while (ctr < 100) {
            n++;
            if(n % 2 != 0) {
                // check if the number is even
                if(isPrime(n)) {
                    sum += n;
                }
            }
            ctr ++;
        }
        System.out.println("Sum of the prime numbers till 100: " + sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}
