package com.AnjaniJha.DSA.Sorting.Type1;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public int[] bubbleSort(int[] nums) {
        int n = nums.length;

        for (int i = n - 1; i >= 1; i--) {

            boolean swapped = false;

            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {

                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swapped = true;
                }
            }

            // optimization: already sorted
            if (!swapped) break;
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        BubbleSort sol = new BubbleSort();

        int[] sorted = sol.bubbleSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(sorted));

        sc.close();
    }
}