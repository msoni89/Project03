package org.project.problem;

import org.project.problem.helper.ListNode;

public class MergeTwoLists {

    public static void main(String[] args) {

        // 1 - 1 - 2 - 3 - 4 - 5
        var list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        var list2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        System.out.println(new MergeTwoLists().mergeTwoLists(list1, list2));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
