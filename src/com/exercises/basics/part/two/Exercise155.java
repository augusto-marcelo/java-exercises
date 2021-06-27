package com.exercises.basics.part.two;

public class Exercise155 {
    /**
     * 155. Write a Java program to print an array after changing the rows and columns of
     * a given two-dimensional array.
     *
     * Original Array:
     * 10 20 30
     * 40 50 60
     *
     * After changing the rows and columns of the said array:10 40
     * 20 50
     * 30 60
     */
    public static void main(String[] args) {
        int[][] numbers = {{10, 20, 30}, {40, 50, 60}};
        changeAndPrint(numbers);
    }

    public static void changeAndPrint(int[][] numbers) {
        for(int i = 1; i < numbers[0].length -1; i++) {
            int temp = numbers[0][i + 1];
            numbers[0][i + 1] = numbers[1][i];
            numbers[1][i] = temp;
        }

        for(int[] intArr: numbers) {
            for(int i = 1; i < intArr.length; i++) {
                System.out.print(intArr[i] + " ");
            }
            System.out.println();
        }
    }
}
