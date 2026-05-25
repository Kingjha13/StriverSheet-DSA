package com.AnjaniJha.DSA.Arrays.Easy;

public class Left_Rotate_Array_by_One {

    public void rotateArrayByOne(int[] nums) {
        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = first;
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Left rotate the array by one place.
         *
         * Example:
         * Input:  [1, 2, 3, 4, 5]
         * Output: [2, 3, 4, 5, 1]
         *
         * Explanation:
         * The first element is moved to the last position,
         * and all remaining elements shift one position left.
         *
         * Approach:
         * 1. Store the first element.
         * 2. Shift every element one position to the left.
         * 3. Place the stored first element at the last index.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         *
         * Test Cases:
         * nums = {1, 2, 3, 4, 5} -> {2, 3, 4, 5, 1}
         * nums = {7, 8, 9}       -> {8, 9, 7}
         * nums = {10}            -> {10}
         *
         * To test:
         *
         * Left_Rotate_Array_by_One obj =
         *         new Left_Rotate_Array_by_One();
         *
         * int[] nums = {1, 2, 3, 4, 5};
         *
         * obj.rotateArrayByOne(nums);
         *
         * for (int num : nums) {
         *     System.out.print(num + " ");
         * }
         *
         */
    }
}