package org.project.problem;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9));
    }

//    a + b = taget
// a  = target - b;


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (memo.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = memo.get(target - nums[i]);
                return result;
            }
            memo.put(nums[i], i);
        }
        return result;
    }
}
