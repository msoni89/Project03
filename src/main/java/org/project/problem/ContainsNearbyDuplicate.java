package org.project.problem;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

    public static void main(String[] args) {
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (store.containsKey(nums[i])) {
                var prevIndex = store.get(nums[i]);
                if (Math.abs(prevIndex - i) <= k) {
                    return true;
                }
            }
            store.put(nums[i], i);
        }
        return false;
    }
}
