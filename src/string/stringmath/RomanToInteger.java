package string.stringmath;

import java.util.*;

public class RomanToInteger {

    /*
    Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Read more details about roman numerals at Roman Numeric System

Example :

Input : "XIV"
Return : 14
Input : "XX"
Output : 20
     */

    public int romanToInt(String a) {
        int i = 0, res = 0;
        int len = a.length();
        while (i < len) {
            int num = roman.get(a.charAt(i));
            if (i + 1 < len && num < roman.get(a.charAt(i + 1))) {
                res -= num;
            } else {
                res += num;
            }
            i++;
        }
        return res;
    }

    public Map<Character, Integer> roman = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };
}
