package com.AnjaniJha.DSA.Recursion;

public class Ntimes {

    public static void printName(int n, String name) {

        // Base case
        if (n == 0) {
            return;
        }

        System.out.println(name);

        // Recursive call
        printName(n - 1, name);
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Print a given name N times using recursion.
         *
         * Example:
         * Input: n = 5, name = "Avanish"
         * Output:
         * Avanish
         * Avanish
         * Avanish
         * Avanish
         * Avanish
         *
         * Approach:
         * 1. Print name
         * 2. Reduce n by 1
         * 3. Stop when n == 0
         *
         * Time Complexity: O(n)
         * Space Complexity: O(n) (recursion stack)
         *
         * How to test:
         * printName(5, "Avanish");
         * printName(3, "Anjani");
         */

        printName(5, "Avanish");
    }
}