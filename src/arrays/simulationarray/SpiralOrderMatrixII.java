package arrays.simulationarray;

import java.util.ArrayList;

public class SpiralOrderMatrixII {

    /*
        Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

        Example:

        Given n = 3,

        You should return the following matrix:
         [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ] 
     */
    public static ArrayList<ArrayList<Integer>> spiralMatrix2(int n) {

        int[][] res = new int[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int step = 1;
        int dir = 0;

        while (top <= bottom && left <= right) {
            switch (dir) {
                //left to right
                case 0:
                    for (int i = left; i <= right; i++) {
                        res[top][i] = step++;
                    }
                    top++;
                    dir = 1;
                    break;

                //top to bottom
                case 1:
                    for (int i = top; i <= bottom; i++) {
                        res[i][right] = step++;
                    }
                    right--;
                    dir = 2;
                    break;

                //right to left
                case 2:
                    for (int i = right; i >= left; i--) {
                        res[bottom][i] = step++;
                    }
                    bottom--;
                    dir = 3;
                    break;

                //bottom to top
                case 3:
                    for (int i = bottom; i >= top; i--) {
                        res[i][left] = step++;
                    }
                    left++;
                    dir = 0;
                    break;

            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arr = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                arr.add(j, res[i][j]);
            }

            result.add(i, arr);
        }

        return result;
    }
}
