package org.project.problem;


import org.project.problem.helper.ListNode;

public class AddNumberIntoLastToList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(4, new ListNode(8, new ListNode(10)))))));

        System.out.println(new AddNumberIntoLastToList().addNode(node, 11));
    }

    private ListNode addNode(ListNode node, int num) {
        if (node != null)
            node.next = addNode(node.next, num);
        else
            node = new ListNode(num);

        return node;
    }
}

