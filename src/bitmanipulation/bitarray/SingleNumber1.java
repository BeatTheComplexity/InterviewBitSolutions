/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example :

Input : [1 2 2 3 1]
Output : 3
 */
package bitmanipulation.bitarray;

import java.util.List;

/**
 *
 * @author NITISH
 */
public class SingleNumber1 {
    	public int singleNumber(final List<Integer> a) {
	    int res =a.get(0);
	    for(int i=1;i<a.size();i++){
	        res^=a.get(i);
	    }
	    return res;
	}
}
