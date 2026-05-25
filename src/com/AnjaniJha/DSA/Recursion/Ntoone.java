package com.AnjaniJha.DSA.Recursion;

public class Ntoone {

    public void printNumbers(int n) {
        print(n);
    }

    private void print(int i) {

        // Base case
        if (i == 0) {
            return;
        }

        System.out.println(i);

        // Recursive call
        print(i - 1);
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Print numbers from N to 1 using recursion.
         *
         * Example:
         * Input: 5
         * Output:
         * 5
         * 4
         * 3
         * 2
         * 1
         *
         * Approach:
         * 1. Print current number
         * 2. Decrease by 1
         * 3. Stop at 0
         *
         * Time Complexity: O(n)
         * Space Complexity: O(n)
         */

        Ntoone obj = new Ntoone();
        obj.printNumbers(5);
    }
}