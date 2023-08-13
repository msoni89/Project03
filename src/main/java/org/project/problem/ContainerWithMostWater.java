package org.project.problem;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r){
            maxArea = Math.max(maxArea, Math.min(height[l], height[r])
                    * (r - l));

            if(height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxArea;
    }
}
