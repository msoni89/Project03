package org.project.problem;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(new FindMinimumInRotatedSortedArray().findMin(new int[]{4,5,6,7,0,1,2}));
    }

    public int findMin(int[] nums) {
        int min =  nums[0];
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) >>> 1;
            min = Math.min(min, nums[mid]);
            min = Math.min(min, nums[l]);
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return min;
    }
}
