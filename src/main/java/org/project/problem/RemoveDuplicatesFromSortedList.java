package org.project.problem;

import org.project.problem.helper.ListNode;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(2)));
        System.out.println(new RemoveDuplicatesFromSortedList().deleteDuplicates(node));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            head.next = deleteDuplicates(head.next);
            if (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
        }
        return head;
    }
}
