package org.project.problem;

import org.project.problem.helper.TreeNode;

import java.util.*;

public class DFSBinaryTree {


    public static void main(String[] args) {

        TreeNode<String> root = new TreeNode<>("a");
        TreeNode<String> b = new TreeNode<>("b");
        TreeNode<String> c = new TreeNode<>("c");
        root.left = b;
        root.right = c;

        TreeNode<String> d = new TreeNode<>("d");
        TreeNode<String> e = new TreeNode<>("e");
        b.left = d;
        b.right = e;

        TreeNode<String> f = new TreeNode<>("f");
        TreeNode<String> g = new TreeNode<>("g");
        c.left = f;
        c.right = g;

        System.out.println(new DFSBinaryTree().dfs(root));
    }

    public List<String> dfs(TreeNode<String> root) {
        if (root == null) return List.of();
        List<String> list = new ArrayList<>();
        Stack<TreeNode<String>> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            var s = stack.pop();
            list.add(s.val);
            if (s.right != null) stack.push(s.right);
            if (s.left != null) stack.push(s.left);
        }
        return list;
    }
}
