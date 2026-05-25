package com.AnjaniJha.DSA.Recursion;

public class SumOfFirstNNumbers {

    public int sumOfFirstN(int n) {
        return helper(n, 0);
    }

    private int helper(int i, int sum) {
        if (i == 0) {
            return sum;
        }
        return helper(i - 1, sum + i);
    }
}