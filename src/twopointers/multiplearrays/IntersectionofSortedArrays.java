/*
Find the intersection of two sorted arrays.
OR in other words,
Given 2 sorted arrays, find all the elements which occur in both the arrays.

Example :

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 3 5]

Output : [3 3 5]

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 5]

Output : [3 5]
 */
package twopointers.multiplearrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NITISH
 */
public class IntersectionofSortedArrays {
    	// DO NOT MODIFY THE LISTS
	public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
ArrayList<Integer> res = new ArrayList<Integer>();
int i=0,j=0;
while(i<a.size() && j<b.size())
{
    if(a.get(i)<b.get(j)){
        i++;
    }
    else if(a.get(i)>b.get(j)){
        j++;
    }
    else{
        res.add(b.get(j));
        j++;
        i++;
    }
}
return res;
	}
}
