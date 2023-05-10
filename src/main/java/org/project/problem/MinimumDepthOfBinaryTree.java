package org.project.problem;

import org.project.problem.helper.TreeNode;

public class MinimumDepthOfBinaryTree {

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
        TreeNode<Integer> ga = new TreeNode<>(19);
        f.left = ga;
        System.out.println(new MinimumDepthOfBinaryTree().minDepth(root));
    }


    public int minDepth(TreeNode<Integer> root) {
        return root == null ? 0 : 1 + Math.max(minDepth(root.right), minDepth(root.left));
    }


}
