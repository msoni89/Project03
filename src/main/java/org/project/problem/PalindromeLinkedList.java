package org.project.problem;

import org.project.problem.helper.ListNode;

public class PalindromeLinkedList {
//    Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

    public static void main(String[] args) {
        ListNode root = new ListNode(1);

        System.out.println(new PalindromeLinkedList().isPalindrome(root));
    }

    public boolean isPalindrome(ListNode head) {
        // reverse it, compare it? -  reverse will take extra space O(N).

        // find middle node
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse from middle to end
        ListNode reverse = reverse(slow);
        while (true) {
            if (head != null && reverse != null && head.val != reverse.val) {
                return false;
            }
            if (head == null && reverse == null) {
                break;
            }
            if (reverse != null) {
                reverse = reverse.next;
            }
            if (head != null) {
                head = head.next;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        node = prev;
        return node;
    }
}
