package org.project.problem;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        // [0] , [0,1], [1, 1, 2]
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1, 2}));
    }

    public int removeDuplicates(int[] numbers) {
        int leftIndex = 1;
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                numbers[leftIndex] = numbers[i  + 1];
                leftIndex++;
            }
        }
        return leftIndex;
    }
}
