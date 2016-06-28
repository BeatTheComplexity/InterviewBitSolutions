/*
Write a function that takes an unsigned integer and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.

Note that since Java does not have unsigned int, use long for Java
 */
package bitmanipulation.bitplay;

/**
 *
 * @author NITISH
 */
public class NumberOf1Bits {
    	public int numSetBits(long a) {
	    int num=0;
	    while(a>0){
	        if(a%2==1)
	        num++;
	        a/=2;
	    }
	    return num;
	}
}