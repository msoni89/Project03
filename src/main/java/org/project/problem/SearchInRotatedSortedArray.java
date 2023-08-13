package org.project.problem;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) >>> 1;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[mid] < target || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (nums[mid] > target || target > nums[r]) {
                    r  = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }


        // 4,5,6,7,0,1,2
//        if (nums[l] <= nums[mid]) {
//            if (nums[mid] < target || target < nums[l]) {
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//            }
//        } else {
//            if (nums[mid] > target || target > nums[r]) {
//                r = -1;
//            } else {
//                l = mid + 1;
//            }
//        }
        return -1;
    }
}
