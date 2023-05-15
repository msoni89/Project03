package org.project.problem;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(new MatrixDiagonalSum().diagonalSum(matrix));
    }

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i == mat.length - 1 - i) {
                sum += (mat[i][i]);
            } else {
                sum += (mat[i][i] + mat[i][mat.length - 1 - i]);
            }
        }
        return sum;
    }
}


/**
 * Given a square matrix mat, return the sum of the matrix diagonals.
 * <p>
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: mat = [[1,2,3],
 * [4,5,6],
 * [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 * Example 2:
 * <p>
 * Input: mat = [[1,1,1,1],
 * [1,1,1,1],
 * [1,1,1,1],
 * [1,1,1,1]]
 * Output: 8
 * Example 3:
 * <p>
 * Input: mat = [[5]]
 * Output: 5
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == mat.length == mat[i].length
 * 1 <= n <= 100
 * 1 <= mat[i][j] <= 100
 **/