package org.project.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingStairsProb70 {

    // Dynamic programing question
    public static void main(String[] args) {
        System.out.println(new ClimbingStairsProb70().climbStairs(45));
    }

    Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int stairs) {
        if (map.containsKey(stairs)) return map.get(stairs);
        if (stairs == 0) return 1;
        if (stairs < 0) return 0;
        var stair = climbStairs(stairs - 1) + climbStairs(stairs - 2);
        map.put(stairs, stair);
        return stair;
    }

}
