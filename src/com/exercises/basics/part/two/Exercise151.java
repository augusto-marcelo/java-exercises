package com.exercises.basics.part.two;

public class Exercise151 {
    /**
     * 151. Write a Java program to find the value of specified expression. Go to the editor
     * a) 101 + 0) / 3
     * b) 3.0e-6 * 10000000.1
     * c) true && true
     * d) false && true
     * e) (false && false) || (true && true)
     * f) (false || false) && (true && true)
     *
     * Expected Output :
     * (101 + 0) / 3)-> 33
     * (3.0e-6 * 10000000.1)-> 30.0000003
     * (true && true)-> true
     * (false && true)-> false
     * ((false && false) || (true && true))-> true
     * (false || false) && (true && true)-> false
     */
    public static void main(String[] args) {

        int a = (101 + 0) / 3;
        double b = 3.0e-6 * 10000000.1;
        boolean c = true && true;
        boolean d = false && true;
        boolean e = (false && false) || (true && true);
        boolean f = (false || false) && (true && true);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

}
