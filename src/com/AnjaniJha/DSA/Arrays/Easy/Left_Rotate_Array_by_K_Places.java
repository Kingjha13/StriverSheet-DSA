package com.AnjaniJha.DSA.Arrays.Easy;

import java.util.Scanner;

public class Left_Rotate_Array_by_K_Places {

    public void rotateArray(int[] nums, int k) {
        int n = nums.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    private void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Left_Rotate_Array_by_K_Places obj =
                new Left_Rotate_Array_by_K_Places();

        obj.rotateArray(nums, k);

        System.out.println("Array after left rotation:");

        obj.printArray(nums);

        sc.close();
    }
}