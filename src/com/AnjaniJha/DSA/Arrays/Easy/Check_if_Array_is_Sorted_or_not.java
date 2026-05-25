package com.AnjaniJha.DSA.Arrays.Easy;


public class Check_if_Array_is_Sorted_or_not {

    public boolean isSorted(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Check whether the given array is sorted in non-decreasing order.
         *
         * Example:
         * Input:  [1, 2, 3, 4, 5]
         * Output: true
         *
         * Input:  [1, 3, 2, 4]
         * Output: false
         *
         * Approach:
         * Compare every element with its next element.
         * If nums[i] > nums[i + 1], array is not sorted.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         *
         * To Test:
         *
         * Check_if_Array_is_Sorted_or_not obj =
         *      new Check_if_Array_is_Sorted_or_not();
         *
         * int[] arr = {1, 2, 3, 4, 5};
         *
         * System.out.println(obj.isSorted(arr));
         */
    }
}