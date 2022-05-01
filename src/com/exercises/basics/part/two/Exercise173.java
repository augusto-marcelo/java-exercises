package com.exercises.basics.part.two;

public class Exercise173 {
    /**
     * 173. Write a Java program to find the median of the number inside the window (size k)
     * at each moving in a given array of integers with duplicate numbers.
     *
     * Move the window from the start of the array.
     *
     * Sample Output:
     * {|1, 2, 3|, 4, 5, 6, 7, 8, 8} -> Return median 2
     * {1, |2, 3, 4|, 5, 6, 7, 8, 8} -> Return median 3
     * {1, 2, |3, 4, 5|, 6, 7, 8, 8} -> Return median 4
     * {1, 2, 3, |4, 5, 6|, 7, 8, 8} -> Return median 5
     * {1, 2, 3, 4, |5, 6, 7|, 8, 8} -> Return median 6
     * {1, 2, 3, 4, 5, |6, 7, 8|, 8} -> Return median 7
     * {1, 2, 3, 4, 5, 6, |7, 8, 8|} -> Return median 8
     * Result array {2, 3, 4, 5, 6, 7, 8}
     *
     * Expected Output:
     *
     * Original array: [1, 2, 3, 4, 5, 6, 7, 8, 8]
     *
     * Value of k: 3
     *
     * Result:
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     */
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        for(int i = 0; i < array.length -2; i++ ){

            int temp = 0;
            for(int j = i; j < i + 3; j++) {
                temp += array[j];
            }
            System.out.println(temp / 3);
        }

    }

    public static int calcMedian(int[] numbers) {
        return 0;
    }

    public static int nextWindowPosition(int[] array, int windowSize, int currentPosition) {
        return 0;
    }
}
