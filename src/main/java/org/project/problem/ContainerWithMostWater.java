package org.project.problem;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int x = j  - i;
                int y = height[j] - height[i];
                System.out.println(x + ", "+(height[j] - y));
                area = Math.max(area, (height[j] - y) * j -  x);
            }
        }
        return area;
    }
}
