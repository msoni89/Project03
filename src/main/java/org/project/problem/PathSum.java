package org.project.problem;

import org.project.problem.helper.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathSum {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> b = new TreeNode<>(2);
        TreeNode<Integer> c = new TreeNode<>(3);
        root.left = b;
        System.out.println(new PathSum().hasPathSum(root, 3));
    }

    public boolean hasPathSum(TreeNode<Integer> root, int targetSum) {
        if (root == null) return false;
        var newTargetSum = targetSum - root.val;
        if(newTargetSum == 0 && root.right == null && root.left == null) return true;
        var hasRightTargetSum = hasPathSum(root.right, newTargetSum);
        var hasLeftTargetSum = hasPathSum(root.left, newTargetSum);
        return hasRightTargetSum || hasLeftTargetSum;
    }
}
