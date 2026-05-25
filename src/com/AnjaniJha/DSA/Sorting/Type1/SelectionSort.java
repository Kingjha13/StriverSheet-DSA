package com.AnjaniJha.DSA.Sorting.Type1;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public int[] selectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // swap only if needed
            if (minIndex != i) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
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

        SelectionSort sol = new SelectionSort();

        int[] sorted = sol.selectionSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(sorted));

        sc.close();
    }
}