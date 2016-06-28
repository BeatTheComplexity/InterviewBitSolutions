package twopointers.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSumZero {

    /*
        Given an array S of n integers, 
        are there elements a, b, c in S such that a + b + c = 0? 
        Find all unique triplets in the array which gives the sum of zero.

        Note:

        Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
        The solution set must not contain duplicate triplets. 
        For example, given array S = {-1 0 1 2 -1 -4}, 
        A solution set is:
        (-1, 0, 1)
        (-1, -1, 2) 
     */
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (a.size() < 3) {
            return result;
        }
        Collections.sort(a);
        for (int i = 0; i < a.size() - 2; i++) {
            if (i == 0 || a.get(i) > a.get(i - 1)) {

                int start = i + 1;
                int end = a.size() - 1;
                while (start < end) {
                    if (a.get(i) + a.get(start) + a.get(end) == 0) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(a.get(i));
                        temp.add(a.get(start));
                        temp.add(a.get(end));
                        result.add(temp);
                        start++;
                        end--;
                        while (start < end && a.get(end) == a.get(end + 1)) {
                            end--;
                        }
                        while (start < end && a.get(start) == a.get(start - 1)) {
                            start++;
                        }
                    } else if ((a.get(i) + a.get(start) + a.get(end)) < 0) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return result;
    }
}
