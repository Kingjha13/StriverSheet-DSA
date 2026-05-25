package com.AnjaniJha.DSA.Arrays.Easy;

public class Largest_Element {

    public int largest(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Find the largest element in the given array.
         *
         * Example:
         * Input:  [3, 8, 2, 10, 5]
         * Output: 10
         *
         * Approach:
         * 1. Assume the first element is the maximum.
         * 2. Traverse the array.
         * 3. If a larger element is found, update max.
         * 4. Return max after traversal.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         *
         * Test Cases:
         * nums = {1, 2, 3, 4, 5}      -> 5
         * nums = {5, 4, 3, 2, 1}      -> 5
         * nums = {-1, -5, -2, -10}    -> -1
         * nums = {7}                  -> 7
         *
         * To test:
         *
         * Largest_Element obj = new Largest_Element();
         * int[] nums = {3, 8, 2, 10, 5};
         * System.out.println(obj.largest(nums));
         *
         */
    }
}