package com.AnjaniJha.DSA.Arrays.Easy;

public class Remove_duplicates_from_sorted_array {

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Remove duplicates from a sorted array in-place and return new length.
         *
         * Example:
         * Input:  [1,1,2,2,3]
         * Output: 3 → [1,2,3,_]
         *
         * Approach:
         * 1. Use two pointers (i, j).
         * 2. i tracks unique elements.
         * 3. j scans the array.
         * 4. When nums[j] != nums[i], move i and update value.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         *
         * Test Cases:
         * [1,1,2] -> 2
         * [0,0,1,1,1,2,2] -> 3
         * [1,2,3] -> 3
         *
         * How to test:
         *
         * Remove_duplicates_from_sorted_array obj =
         *         new Remove_duplicates_from_sorted_array();
         *
         * int[] nums = {1,1,2,2,3};
         * int len = obj.removeDuplicates(nums);
         *
         * for (int k = 0; k < len; k++) {
         *     System.out.print(nums[k] + " ");
         * }
         */
    }
}