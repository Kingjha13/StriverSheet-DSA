package com.AnjaniJha.DSA.Arrays.Easy;

public class Linear_Search {

    public int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Find the index of a target element in an array using Linear Search.
         *
         * Example:
         * Input:  nums = [5, 3, 7, 1, 9], target = 7
         * Output: 2
         *
         * Input:  nums = [5, 3, 7, 1, 9], target = 10
         * Output: -1
         *
         * Approach:
         * 1. Traverse the array from left to right.
         * 2. Compare each element with target.
         * 3. If found, return index immediately.
         * 4. If not found, return -1.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         *
         * Test Cases:
         * [1,2,3,4], target = 3 -> 2
         * [10,20,30], target = 25 -> -1
         * [5], target = 5 -> 0
         *
         * How to test:
         *
         * Linear_Search obj = new Linear_Search();
         * int[] nums = {5, 3, 7, 1, 9};
         * System.out.println(obj.linearSearch(nums, 7));
         *
         */
    }
}