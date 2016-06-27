/*
 *Remove duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.

 Example: 
Given input array A = [1,1,2],
Your function should return length = 2, and A is now [1,2]. 
 */
package twopointers.inplaceupdate;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author NITISH
 */
public class RemoveDuplicatesFromArray {
    	public int removeDuplicates(ArrayList<Integer> a) {
	    int index =1;
	    if(a.size()==0)
	    return 0;
	    Collections.sort(a);
	    for( int i=1;i<a.size();i++)
	    {
	        if(!a.get(i).equals(a.get(i-1))){
	            a.set(index,a.get(i));
	            index++;
	        }
	    }
	    return index;
	}
}
