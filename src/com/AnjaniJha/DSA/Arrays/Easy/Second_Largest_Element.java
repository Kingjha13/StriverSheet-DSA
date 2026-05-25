package com.AnjaniJha.DSA.Arrays.Easy;

import java.util.Arrays;

public class Second_Largest_Element {

    public int secondLargestElement(int[] nums) {

        if (nums == null || nums.length < 2) {
            return -1;
        }

        Arrays.sort(nums);

        int largest = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < largest) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Find the second largest element in an array.
         *
         * Example:
         * Input:  [12, 35, 1, 10, 34, 1]
         * Output: 34
         *
         * Approach:
         * 1. Sort the array.
         * 2. Take the largest element.
         * 3. Traverse from right to left.
         * 4. Return first element smaller than largest.
         *
         * Time Complexity: O(n log n)
         * Space Complexity: O(1)
         *
         * Better approach (recommended for interviews):
         * - Do it in one pass (O(n), no sorting)
         */
    }
}