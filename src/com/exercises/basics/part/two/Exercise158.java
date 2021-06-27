package com.exercises.basics.part.two;

public class Exercise158 {
    /**
     * 158. Write a Java program to create a two-dimension array (m x m) A[][]
     * such that A[i][j] is true if I and j are prime and have no common factors,
     * otherwise A[i][j] becomes false. Go to the editor
     *
     * Sample Output:
     * true true true
     * true true true
     * true true false
     */
    public static void main(String[] args) {
        int n = 3;
        boolean[][] A = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = primeCell(i, j) == 1;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int primeCell(int a, int b) {
        if(a == 0 || b == 0) {
            return 1;
        }

        if(a < b) {
            int t = a;
            a = b;
            b = t;
        }

        if(a % b == 0) {
            return b;
        } else {
            return primeCell(b, a % b);
        }

    }
}
