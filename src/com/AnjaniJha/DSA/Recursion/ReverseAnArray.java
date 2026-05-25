package com.AnjaniJha.DSA.Recursion;

public class ReverseAnArray {

    public void reverse(int[] arr) {
        helper(arr, 0, arr.length - 1);
    }

    private void helper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        // swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // recursive call
        helper(arr, left + 1, right - 1);
    }

    /*
     * Iterative approach (for reference):
     *
     * public void reverse(int[] arr) {
     *     int i = 0;
     *     int n = arr.length;
     *
     *     while (i < n / 2) {
     *         int temp = arr[i];
     *         arr[i] = arr[n - 1 - i];
     *         arr[n - 1 - i] = temp;
     *         i++;
     *     }
     * }
     */
}