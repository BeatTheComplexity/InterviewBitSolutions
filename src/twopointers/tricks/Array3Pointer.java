package twopointers.tricks;

import java.util.List;

public class Array3Pointer {

    /*
        You are given 3 arrays A, B and C. All 3 of the arrays are sorted.

       Find i, j, k such that :
       max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])) is minimized.
       Return the minimum max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i]))

       **abs(x) is absolute value of x and is implemented in the following manner : **

             if (x < 0) return -x;
             else return x;
       Example :

       Input : 
               A : [1, 4, 10]
               B : [2, 15, 20]
               C : [10, 12]

       Output : 5 
                With 10 from A, 15 from B and 10 from C. 
     */
    // DO NOT MODIFY THE LISTS
    public int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) {
        /*int res = Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                for(int k=0;k<c.size();k++){
                   int max_one =Math.max(Math.abs(a.get(i)-b.get(j)),Math.abs(b.get(j)-c.get(k)));
                   int max_two =Math.max(max_one,Math.abs(c.get(k)-a.get(i)));
                   if(max_two<res)
                   res=max_two;
                }
            }
        }*/

        int diff = Integer.MAX_VALUE;
        int min, max;
        int i, j, k;
        for (i = 0, j = 0, k = 0; i < a.size() && j < b.size() && k < c.size();) {
            min = Math.min(a.get(i), Math.min(b.get(j), c.get(k)));
            max = Math.max(a.get(i), Math.max(b.get(j), c.get(k)));
            diff = Math.min(diff, max - min);
            if (diff == 0) {
                break;
            }
            if (a.get(i) == min) {
                i++;
            } else if (b.get(j) == min) {
                j++;
            } else {
                k++;
            }
        }

        return diff;
    }
}
