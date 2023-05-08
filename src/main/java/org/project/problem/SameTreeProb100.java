package org.project.problem;

import org.project.problem.helper.TreeNode;

public class SameTreeProb100 {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left = new TreeNode(1);

        TreeNode q = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left = new TreeNode(1);

        System.out.println(new SameTreeProb100().isSameTree(p, q));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return (p == q);
        return (q.val == p.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
