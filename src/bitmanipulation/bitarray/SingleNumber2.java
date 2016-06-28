
import java.util.List;

/*
Given an array of integers, every element appears thrice except for one which occurs once.

Find that element which does not appear thrice.

Note: Your algorithm should have a linear runtime complexity.

Could you implement it without using extra memory?

Example :

Input : [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
Output : 4
package bitmanipulation.bitarray;

/**
 *
 * @author NITISH
 */
public class SingleNumber2 {
    	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    int one =0,two =0,three=0;
	    for(int i=0;i<a.size();i++){
	        two|=one&a.get(i);
	        one^=a.get(i);
	        three=one&two;
	        one&=~three;
	        two&=~three;
	    }
	    return one;
	}
}
