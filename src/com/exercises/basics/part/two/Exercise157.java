package com.exercises.basics.part.two;

public class Exercise157 {
    /**
     * 157. Write a Java program to prove that Euclid’s algorithm computes
     * the greatest common divisor of two positive given integers. Go to the editor
     *
     * According to Wikipedia "The Euclidean algorithm is based on
     * the principle that the greatest common divisor of two numbers does not
     * change if the larger number is replaced by its difference with the smaller number.
     *
     * For example, 21 is the GCD of 252 and 105 (as 252 = 21 × 12 and 105 = 21 × 5),
     * and the same number 21 is also the GCD of 105 and 252 − 105 = 147.
     *
     * Since this replacement reduces the larger of the two numbers, repeating this
     * process gives successively smaller pairs of numbers until the two numbers become equal.
     * When that occurs, they are the GCD of the original two numbers. By reversing the steps,
     * the GCD can be expressed as a sum of the two original numbers each multiplied by a
     * positive or negative integer, e.g., 21 = 5 × 105 + (−2) × 252.
     * The fact that the GCD can always be expressed in this way is known as Bézout's identity."
     *
     * Expected Output:
     * result: 24
     * result: 1
     */
    public static void main(String[] args) {
        int test1 = findGCD(48, 24);
        int test2 = findGCD(125463, 9658);
        int test3 = findGCD(105, 252);

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

    }

    public static int findGCD(int a, int b) {
        int gdc = 0;

        if(a == 0) {
            return b;
        } else if(b == 0) {
            return a;
        } else {
            int reminder = a % b;

            gdc = findGCD(b, reminder);
            return gdc;
        }
    }
}
