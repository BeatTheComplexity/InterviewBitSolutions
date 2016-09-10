package arrays.simulationarray;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrixI {

    /*
        Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.
    
        Given the following matrix:
        [
            [ 1, 2, 3 ],
            [ 4, 5, 6 ],
            [ 7, 8, 9 ]
        ]
    
        You should return
        [1, 2, 3, 6, 9, 8, 7, 4, 5]
     */
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<>();

        if (a.size() <= 0) {
            return result;
        }

        int top = 0, bottom = a.size() - 1, left = 0, right = a.get(0).size() - 1;
        int dir = 0;

        while (top <= bottom && left <= right) {
            switch (dir) {
                case 0: {
                    for (int i = left; i <= right; i++) {
                        result.add(a.get(top).get(i));
                    }
                    top++;
                    dir = 1;
                }
                break;
                case 1: {
                    for (int i = top; i <= bottom; i++) {
                        result.add(a.get(i).get(right));
                    }
                    right--;
                    dir = 2;
                }
                break;
                case 2: {
                    for (int i = right; i >= left; i--) {
                        result.add(a.get(bottom).get(i));
                    }
                    bottom--;
                    dir = 3;
                }
                break;
                case 3:
                    for (int i = bottom; i >= top; i--) {
                        result.add(a.get(i).get(left));
                    }
                    left++;
                    dir = 0;
                    break;

            }
        }

        return result;
    }
}
