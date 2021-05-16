package com.exercises;

import java.util.Arrays;

public class Exercise124 {
    /**
     * 124. Write a Java program to find the index of a value in a sorted array.
     * If the value does not find return the index where it would be if it were inserted in order.
     * Example:
     * [1, 2, 4, 5, 6] 5(target) -> 3(index)
     * [1, 2, 4, 5, 6] 0(target) -> 0(index)
     * [1, 2, 4, 5, 6] 7(target) -> 5(index)
     */
    public static void main(String[] args) {

        int[] sortedArray = {1, 2, 4, 5, 8};
        int targetTest1 = 5;
        int targetTest2 = 0;
        int targetTest3 = 7;

        System.out.println("Original Array: " + Arrays.toString(sortedArray));
        System.out.println("Target 1 = " + targetTest1 + " | Index = " + findIndex(targetTest1, sortedArray));
        System.out.println("Target 2 = " + targetTest2 + " | Index = " + findIndex(targetTest2, sortedArray));
        System.out.println("Target 3 = " + targetTest3 + " | Index = " + findIndex(targetTest3, sortedArray));

    }

    public static int findIndex(int target, int[] sortedNums) {
        if(sortedNums == null || sortedNums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = sortedNums.length - 1;
        int mid;

        while(start + 1 < end) {
            mid = start + (end - start) / 2;
            if(sortedNums[mid] == target) {
                return mid;
            } else if (sortedNums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if(sortedNums[start] >= target) {
            return start;
        } else if(sortedNums[start] < target && target <= sortedNums[end]) {
            return end;
        } else {
            return end + 1;
        }
    }
}
