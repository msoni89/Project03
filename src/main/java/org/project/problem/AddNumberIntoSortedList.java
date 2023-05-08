package org.project.problem;

import org.project.problem.helper.ListNode;

public class AddNumberIntoSortedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(10)))))));
        System.out.println(new AddNumberIntoSortedList().addNumberIntoSortedList(node, 11));

    }

    private ListNode addNumberIntoSortedList(ListNode node, int num) {
        if (node != null)
            node.next = addNumberIntoSortedList(node.next, num);
        else
            node = new ListNode(num);

        return node;
    }
}
