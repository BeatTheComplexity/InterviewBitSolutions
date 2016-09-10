package math.numberencoding;

import java.util.ArrayList;

public class RearrangeArray {

    /*
        Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] 
        with O(1) extra space.
    
        Example:
        Input : [1, 0]
        Return : [0, 1]
    
        Lets say N = size of the array. Then, following holds true :
        -- All elements in the array are in the range [0, N-1]
        -- N * N does not overflow for a signed integer 
     */
    public static void arrange(ArrayList<Integer> a) {
        if (a == null || a.isEmpty()) {
            return;
        }
        int n = a.size();

        for (int i = 0; i < n; i++) {
            int num = a.get(i);
            int b = num;
            int c = a.get(num);
            if (c >= n) {
                c = a.get(num) % n;
            }

            int value = b + c * n;
            a.set(i, value);
        }

        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) / n);
        }

    }
}
