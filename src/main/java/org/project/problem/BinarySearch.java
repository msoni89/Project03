package org.project.problem;

public class BinarySearch {
    public static void main(String[] args) {

        System.out.println(new BinarySearch().binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3));
    }

    public int binarySearch(int[] numbers, int num) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
//          int mid = l + (r - l) / 2;
            int mid = (left + right) >>> 1;
            if (numbers[mid] == num) return mid;
            if (numbers[mid] > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
