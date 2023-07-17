package org.project.problem;

import org.project.problem.helper.ListNode;

public class PalindromeLinkedList {
//    Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

    public static void main(String[] args) {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

        System.out.println(new PalindromeLinkedList().isPalindrome(root));
    }

    public boolean isPalindrome(ListNode head) {
        // reverse it, compare it? -  reverse will take extra space O(N).

        return false;
    }
}
