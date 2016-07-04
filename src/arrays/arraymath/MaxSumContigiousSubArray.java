package arrays.arraymath;

import java.util.List;

public class MaxSumContigiousSubArray {

    /*Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.*/

    // DO NOT MODFIY THE LIST. 
    public int maxSubArray(final List<Integer> a) {
        int len = a.size();
        if (len == 0) {
            return 0;
        }
        int res = a.get(0);
        int cont = res;
        for (int i = 1; i < len; i++) {
            int num = a.get(i);
            if (cont < 0) {
                cont = num;
            } else {
                cont += num;
            }
            res = Math.max(res, cont);
        }
        return res;

    }
}
