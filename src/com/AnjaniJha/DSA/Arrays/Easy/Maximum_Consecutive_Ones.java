package com.AnjaniJha.DSA.Arrays.Easy;

public class Maximum_Consecutive_Ones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Find the maximum number of consecutive 1's in a binary array.
         *
         * Example:
         * Input:  [1,1,0,1,1,1]
         * Output: 3
         *
         * Explanation:
         * The longest sequence of consecutive 1's is 3.
         *
         * Approach:
         * 1. Traverse array.
         * 2. Maintain a counter for current streak of 1s.
         * 3. Reset counter when 0 appears.
         * 4. Track maximum streak.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         *
         * Test Cases:
         * [1,1,0,1,1,1] -> 3
         * [0,0,0]       -> 0
         * [1,1,1,1]     -> 4
         *
         * How to test:
         *
         * Maximum_Consecutive_Ones obj = new Maximum_Consecutive_Ones();
         * int[] nums = {1,1,0,1,1,1};
         * System.out.println(obj.findMaxConsecutiveOnes(nums));
         */
    }
}