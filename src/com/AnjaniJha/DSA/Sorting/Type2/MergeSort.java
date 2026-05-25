package com.AnjaniJha.DSA.Sorting.Type2;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] nums) {
        mergeSortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSortHelper(int[] nums, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSortHelper(nums, start, mid);
        mergeSortHelper(nums, mid + 1, end);

        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];

        int left = start;
        int right = mid + 1;
        int index = 0;

        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = nums[left++];
        }

        while (right <= end) {
            temp[index++] = nums[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[start + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        MergeSort sol = new MergeSort();

        int[] nums1 = {7, 4, 1, 5, 3};
        int[] nums2 = {5, 4, 4, 1, 1};

        System.out.println(Arrays.toString(sol.mergeSort(nums1)));
        System.out.println(Arrays.toString(sol.mergeSort(nums2)));
    }
}