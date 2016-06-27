/*
Remove Duplicates from Sorted Array

Given a sorted array, remove the duplicates in place such that each element appear atmost twice and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

Note that even though we want you to return the new length, make sure to change the original array as well in place

For example,
Given input array A = [1,1,1,2],

Your function should return length = 3, and A is now [1,1,2].
 */
package twopointers.inplaceupdate;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author NITISH
 */
public class RemoveDuplicatesFromArrayTwo {
    	public int removeDuplicates(ArrayList<Integer> a) {
	    if(a.size()<2 )
	    return a.size();
	    Collections.sort(a);
	    int index =1;
	    for(int i=2;i<a.size();i++){
	        if(!a.get(i).equals(a.get(index-1))){
	            index++;
	            a.set(index,a.get(i));
	        }
	    }
	    return index+1;
	}
}
