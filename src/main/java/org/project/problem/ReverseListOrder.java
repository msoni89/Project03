package org.project.problem;

import org.project.problem.helper.ListNode;

public class ReverseListOrder {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(10)))))));
        System.out.println(node);
        System.out.println(new ReverseListOrder().reverse(node));
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
