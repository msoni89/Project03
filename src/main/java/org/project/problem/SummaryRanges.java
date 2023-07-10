package org.project.problem;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        System.out.println(new SummaryRanges().summaryRanges(new int[]{-2147483648,-2147483647,2147483647}));
    }

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return List.of();
        }

        List<String> output = new ArrayList<>();
        int currentIndex = 0;
        int lastIndex = 0;

        while (currentIndex < nums.length - 1) {
            if (Math.abs(nums[currentIndex + 1] - nums[currentIndex]) > 1) {
                if (nums[lastIndex] == nums[currentIndex]) {
                    output.add(String.valueOf(nums[lastIndex]));
                } else {
                    output.add(String.format("%d->%d", nums[lastIndex], nums[currentIndex]));
                }
                lastIndex = currentIndex + 1;
            }
            currentIndex++;
        }

        if (nums[lastIndex] == nums[currentIndex]) {
            output.add(String.valueOf(nums[currentIndex]));
        } else {
            output.add(String.format("%d->%d", nums[lastIndex], nums[currentIndex]));
        }

        return output;
    }
}
