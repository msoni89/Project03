package org.project.problem;

import org.project.problem.helper.ListNode;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
//        1,2,6,3,4,5,6
        ListNode root = new ListNode(
                1, new ListNode(
                2, new ListNode(
                6, new ListNode(
                3, new ListNode(
                4, new ListNode(
                5, new ListNode(
                6)))))));

        System.out.println(new RemoveLinkedListElements().removeElements(root, 6));

    }

    public ListNode removeElements(ListNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
           return removeElements(root.next, val);
        }
        root.next = removeElements(root.next, val);
        return root;
    }
}
