package twopointers.sorting;

import java.util.ArrayList;

public class DifferenceK {

    /*
        Given an array ‘A’ of sorted integers and another non negative integer k, 
        find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

         Example: Input : 
            A : [1 3 5] 
            k : 4
         Output : YES as 5 - 1 = 4 
        Return 0 / 1 ( 0 for false, 1 for true ) for this problem

        Try doing this in less than linear space complexity.
    */
    public int diffPossible(ArrayList<Integer> a, int b) {
        int i = 0, j = 1;
        while (j < a.size() && i < a.size()) {
            if ((a.get(j) - a.get(i)) == b && i != j) {
                return 1;
            } else if ((a.get(j) - a.get(i)) < b) {
                j++;
            } else {
                i++;
            }
        }
        return 0;
    }
}
