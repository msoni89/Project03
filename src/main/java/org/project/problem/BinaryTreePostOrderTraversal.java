package org.project.problem;

import org.project.problem.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {

    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(3);
        p.right = right;


        System.out.println(new BinaryTreePostOrderTraversal().postOrderTraversal(p));
    }

    public List<Integer> postOrderTraversal(TreeNode<Integer> root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }

    public void traverse(TreeNode<Integer> node, List<Integer> list) {
        if (node == null) return;
        traverse(node.left, list);
        traverse(node.right, list);
        list.add(node.val);
    }
}
