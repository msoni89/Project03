package org.project.problem;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MoveZeroes().moveZeroes(new int[]{1, 0, 1})));
    }

    public int[] moveZeroes(int[] nums) {
        int swapCount = 0;
        for (int num : nums) {
            if (num == 0) {
                swapCount++;
            }
        }
        int lastSwappedIndex = 0, currentIndex = 0;
        while (currentIndex < nums.length  - swapCount && swapCount != 0 ) {
            int c = nums[currentIndex];
            if (c != 0) {
                currentIndex++;
                continue;
            }

                int value = nums[currentIndex];
                nums[currentIndex] = nums[lastSwappedIndex];
                nums[lastSwappedIndex] = value;
                swapCount--;
                lastSwappedIndex++;
        }
        return nums;
    }
}
