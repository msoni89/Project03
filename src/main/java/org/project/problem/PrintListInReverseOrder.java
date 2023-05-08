package org.project.problem;

import org.project.problem.helper.ListNode;

public class PrintListInReverseOrder {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(10)))))));

        System.out.println(new PrintListInReverseOrder().print(node));

    }

    private ListNode print(ListNode node) {
        if (node != null) {
            print(node.next);
            System.out.println(node.val);
        }
        return node;
    }
}
