package twopointers.inplaceupdate;

import java.util.ArrayList;

public class RemoveElementsFromArray {

    /*
        Remove Element

        Given an array and a value, remove all the instances of that value in the array. 
        Also return the number of elements left in the array after the operation.
        It does not matter what is left beyond the expected length.

         Example:
        If array A is [4, 1, 1, 2, 1, 3]
        and value elem is 1, 
        then new length is 3, and A is now [4, 2, 3] 
        Try to do it in less than linear additional space complexity.
     */
    public int removeElement(ArrayList<Integer> a, int b) {

        /* //easy approach
	    
	    while(a.contains(b)){
	        a.remove( new Integer(b));
	    }
	    return a.size();
         */
        if (a == null || a.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != b) {
                a.set(count, a.get(i));
                count++;
            }
        }
        return count;
    }
}
