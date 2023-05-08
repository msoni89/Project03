package org.project.problem;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        System.out.println(new MoveZeroes().moveZeroes(new int[]{0, 1, 0, 3, 12}));
    }

    public int[] moveZeroes(int[] nums) {

        int a = 0;

        while (a < nums.length - 1) {

            if (nums[a] == 0) {
                int num = nums[a + 1];
                nums[a + 1] = nums[a];
                nums[a] = num;
            }

            System.out.println(a);
            System.out.println(Arrays.toString(nums));
            a++;
        }

        return nums;
    }
}
