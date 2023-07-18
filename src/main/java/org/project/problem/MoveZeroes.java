package org.project.problem;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MoveZeroes().moveZeroes(new int[]{1, 0, 1})));
    }

    public int[] moveZeroes(int[] nums) {
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            } else if (z > 0) {
                int temp = nums[i];
                nums[i - z] = temp;
                nums[i] = 0;
            }
        }


        return nums;
    }
}
