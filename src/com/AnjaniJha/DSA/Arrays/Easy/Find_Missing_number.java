package com.AnjaniJha.DSA.Arrays.Easy;

import java.util.Arrays;

public class Find_Missing_number {

    public int missingNumber(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] != nums[i] + 1) {
                return nums[i] + 1;
            }
        }

        return nums[n - 1] + 1;
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Given an array containing n distinct numbers in the range [0, n],
         * return the only number that is missing from the array.
         *
         * Example 1:
         * Input: [3, 0, 1]
         * Output: 2
         *
         * Example 2:
         * Input: [0, 1]
         * Output: 2
         *
         * Approach:
         * 1. Sort the array.
         * 2. If first element is not 0, then 0 is missing.
         * 3. Traverse the sorted array and find the first gap.
         * 4. Missing number is nums[i] + 1.
         * 5. If no gap exists, then the missing number is n.
         *
         * Dry Run:
         * Input: [3, 0, 1]
         *
         * After Sorting:
         * [0, 1, 3]
         *
         * Gap found between 1 and 3.
         * Missing Number = 2
         *
         * Time Complexity:
         * O(n log n)
         *
         * Space Complexity:
         * O(1)
         *
         * Better Approach:
         * Use Sum Formula or XOR.
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         *
         * To Test:
         *
         * Find_Missing_number obj =
         *      new Find_Missing_number();
         *
         * int[] nums = {3, 0, 1};
         *
         * System.out.println(obj.missingNumber(nums));
         */
    }
}