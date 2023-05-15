package org.project.problem;

import org.project.problem.helper.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode _4 = new ListNode(-4);
        ListNode _0 = new ListNode(0, _4);
        ListNode _2 = new ListNode(2, _0);
        ListNode _3 = new ListNode(3, _2);
//        _4.next = _0;
        System.out.println(new LinkedListCycle().hasCycle(_3));
    }

    public boolean hasCycle(ListNode head) {
//        ListNode slow = head;
//        Set<ListNode> visited = new HashSet<>();
//        while (slow != null) {
//            if (visited.contains(slow)) {
//                return true;
//            }
//            visited.add(slow);
//            slow = slow.next;
//        }
//        return false;

        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null && fast.next != null) {
            if (fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
