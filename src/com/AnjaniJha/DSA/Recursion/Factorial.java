package com.AnjaniJha.DSA.Recursion;

public class Factorial {

    public int factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Find factorial of a number using recursion.
         *
         * Definition:
         * n! = n × (n-1) × (n-2) ... × 1
         *
         * Example:
         * Input: 5
         * Output: 120
         *
         * Approach:
         * 1. Define base case: factorial(0) = 1
         * 2. Recursive relation: n * factorial(n-1)
         *
         * Time Complexity: O(n)
         * Space Complexity: O(n) (recursion stack)
         *
         * Test:
         * Factorial obj = new Factorial();
         * System.out.println(obj.factorial(5)); // 120
         */
    }
}