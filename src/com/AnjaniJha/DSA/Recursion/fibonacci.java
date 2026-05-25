package com.AnjaniJha.DSA.Recursion;

public class fibonacci {

    public int fib(int n) {

        // Base case
        if (n <= 1) {
            return n;
        }

        // Recursive case
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Find nth Fibonacci number using recursion.
         *
         * Sequence:
         * 0, 1, 1, 2, 3, 5, 8, 13, ...
         *
         * Formula:
         * F(n) = F(n-1) + F(n-2)
         *
         * Base Cases:
         * F(0) = 0
         * F(1) = 1
         *
         * Example:
         * Input: 6
         * Output: 8
         *
         * Time Complexity: O(2^n)
         * Space Complexity: O(n)
         *
         * Test:
         * fibonacci obj = new fibonacci();
         * System.out.println(obj.fib(6)); // 8
         */
    }
}