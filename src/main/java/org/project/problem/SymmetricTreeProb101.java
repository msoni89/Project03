package org.project.problem;

import org.project.problem.helper.TreeNode;

public class SymmetricTreeProb101 {


    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);

        TreeNode right = new TreeNode(2);
        TreeNode left = new TreeNode(2);

        right.left = new TreeNode(4);
        right.right = new TreeNode(3);

        left.left = new TreeNode(3);
        left.right = new TreeNode(4);

        p.right = right;
        p.left = left;

        System.out.println(new SymmetricTreeProb101().isSymmetric(p));
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }


    public boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 != null && node2 != null && node1.val == node2.val)
            return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);

        return false;
    }
}

