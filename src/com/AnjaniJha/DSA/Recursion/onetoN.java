package com.AnjaniJha.DSA.Recursion;

public class onetoN {

    public void printNumbers(int n) {
        print(1, n);
    }

    private void print(int i, int n) {

        // Base case
        if (i > n) {
            return;
        }

        System.out.println(i);

        // Recursive call
        print(i + 1, n);
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Print numbers from 1 to N using recursion.
         *
         * Example:
         * Input: 5
         * Output:
         * 1
         * 2
         * 3
         * 4
         * 5
         *
         * Approach:
         * 1. Start from i = 1
         * 2. Print current value
         * 3. Increase i
         * 4. Stop when i > n
         *
         * Time Complexity: O(n)
         * Space Complexity: O(n)
         */

        onetoN obj = new onetoN();
        obj.printNumbers(5);
    }
}