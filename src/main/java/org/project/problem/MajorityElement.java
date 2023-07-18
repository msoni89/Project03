package org.project.problem;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{5, 1, 4, 2, 2, 2, 3}));
    }

    public int majorityElement(int[] nums) {
        int res = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                res = nums[i];
            }

            if (res == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }
}
