package org.project.problem;


import org.project.problem.helper.TreeNode;

public class InvertBinaryTreeProb226 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left =  new TreeNode(1);

        System.out.println(new InvertBinaryTreeProb226().invertTree(root));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.right;
        root.right  =   invertTree(root.left);
        root.left =   invertTree(temp);
        return root;
    }
}
