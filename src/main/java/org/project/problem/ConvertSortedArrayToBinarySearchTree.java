package org.project.problem;

import org.project.problem.helper.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {
        System.out.println(new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(new int[]{-10,-3,0,5,9}));

    }

    public TreeNode<Integer> sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode<Integer> sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = right + (left - right) / 2;
        System.out.println(nums[mid]);
        var root = new TreeNode<Integer>(nums[mid]);
        if (nums[mid] < (right + (mid + 1 - right) / 2)) {
            root.right = sortedArrayToBST(nums, mid + 1, right);
            root.left = sortedArrayToBST(nums, left, mid - 1);
        } else {
            root.right = sortedArrayToBST(nums, mid + 1, right);
            root.left = sortedArrayToBST(nums, left, mid - 1);
        }
        return root;
    }

}
