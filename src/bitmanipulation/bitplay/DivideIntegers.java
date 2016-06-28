package bitmanipulation.bitplay;

public class DivideIntegers {

    /*
        Divide two integers without using multiplication, division and mod operator.

        Return the floor of the result of the division.

        Example:

        5 / 2 = 2
        Also, consider if there can be overflow cases. For overflow case, return INT_MAX.
     */
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        if (divisor == -1 && dividend == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        long posDividend = Math.abs((long) dividend);
        long posDivisor = Math.abs((long) divisor);
        int res = 0;
        while (posDividend >= posDivisor) {
            int shift = 0;
            while (posDividend >= (posDivisor << shift)) {
                shift++;
            }
            res = res + (1 << (shift - 1));
            posDividend -= (posDivisor << (shift - 1));
        }
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            return res;
        } else {
            return -res;
        }
    }
}
