package org.project.problem;

import org.project.problem.helper.TreeNode;

public class BalancedBinaryTree {

    public static void main(String[] args) {
//        1,null,2,null,3
        TreeNode<Integer> root = new TreeNode<>(2);
        root.right = new TreeNode(1);
        root.left = new TreeNode(3);
        System.out.println(new BalancedBinaryTree().isBalanced(root));
    }

    public boolean isBalanced(TreeNode<Integer> root) {
        return maxDepth(root) == 1;
    }

    public int maxDepth(TreeNode<Integer> root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}
