package org.project.problem;

import org.project.problem.helper.TreeNode;

public class BalancedBinaryTree {

    public static void main(String[] args) {

        TreeNode<Integer> root = new TreeNode<>(3);
        TreeNode<Integer> b = new TreeNode<>(9);
        TreeNode<Integer> c = new TreeNode<>(20);
        root.left = b;
        root.right = c;
        TreeNode<Integer> f = new TreeNode<>(15);
        TreeNode<Integer> g = new TreeNode<>(7);
        c.left = f;
        c.right = g;
        System.out.println(new BalancedBinaryTree().isBalanced(root));
    }

    public boolean isBalanced(TreeNode<Integer> root) {
        return false;
    }
}
