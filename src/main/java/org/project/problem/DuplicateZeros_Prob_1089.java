package org.project.problem;

import java.util.Arrays;

public class DuplicateZeros_Prob_1089 {

    public static void main(String[] args) {
        var arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        new DuplicateZeros_Prob_1089().duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void duplicateZeros(int[] arr) {
        int i, sh = 0;
        for (i = 0; sh + i < arr.length; ++i) sh += arr[i] == 0 ? 1 : 0;
        for (i = i - 1; sh > 0; --i) {
            if (i + sh < arr.length)
                arr[i + sh] = arr[i];
            if (arr[i] == 0) arr[i + --sh] = arr[i];
        }
//        int length = arr.length;
//        for (int i = 0; i < length - 1; i++) {
//            if (arr[i] == 0) {
//                int j = length - 1;
//                while (j > i + 1) {
//                    arr[j] = arr[j - 1];
//                    j--;
//                }
//                arr[i + 1] = 0;
//                i++;
//            }
//        }

    }
}
