package com.AnjaniJha.DSA.Sorting.Type1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public int[] insertionSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        InsertionSort sol = new InsertionSort();

        int[] sorted = sol.insertionSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(sorted));

        sc.close();
    }
}