package com.exercises;

import java.util.ArrayList;

public class Exercise123 {
    /**
     * 123. Write a Java program to find the subarray with smallest sum from a given array of integers
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-2);
        nums.add(1);
        nums.add(-3);
        nums.add(4);
        System.out.println(minSubarray(nums));
    }

    public static int minSubarray(ArrayList<Integer> nums) {
        int[] nums1 = new int[nums.size()];
        nums1[0] = nums.get(0);
        int min = nums1[0];

        for(int i = 1; i < nums.size(); ++i){
            nums1[i] = Math.min(nums.get(i), nums.get(i) + nums1[i - 1]);
            min = Math.min(min, nums1[i]);
        }
        return min;
    }

}
