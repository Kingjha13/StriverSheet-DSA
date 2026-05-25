package com.AnjaniJha.DSA.LinkedList.Medium;
import java.util.*;

public class Length_of_a_loop_in_LL {

    public int findLengthOfLoop(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return countCycleLength(slow);
            }
        }

        return 0;
    }

    private int countCycleLength(ListNode meetingPoint) {

        int length = 1;
        ListNode current = meetingPoint.next;

        while (current != meetingPoint) {
            length++;
            current = current.next;
        }

        return length;
    }

    public static void main(String[] args) {

        /*
         * Problem:
         * Find the length of a cycle in a linked list.
         *
         * Example:
         * Input:  1 -> 2 -> 3 -> 4 -> 2 (cycle)
         * Output: 3
         *
         * Approach (Floyd Cycle Detection):
         * 1. Use slow and fast pointers.
         * 2. If they meet → cycle exists.
         * 3. From meeting point, count cycle length.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         *
         * Key Idea:
         * Meeting point is inside the cycle, not start — but still valid to count cycle.
         */
    }
}