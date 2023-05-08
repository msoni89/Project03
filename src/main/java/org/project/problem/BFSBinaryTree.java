package org.project.problem;

import org.project.problem.helper.TreeNode;

import java.util.*;

public class BFSBinaryTree {


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

        System.out.println(new BFSBinaryTree().bfs(root));
    }

    public List<String> bfs(TreeNode<String> root) {
        if (root == null) return List.of();
        List<String> list = new ArrayList<>();
        Queue<TreeNode<String>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            var s = queue.peek();
            list.add(s.val);
            queue.remove(s);
            if (s.left != null) queue.offer(s.left);
            if (s.right != null) queue.offer(s.right);
        }
        return list;
    }
}
