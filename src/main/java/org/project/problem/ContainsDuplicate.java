package org.project.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicate = new HashSet<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (!duplicate.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
