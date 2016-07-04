package arrays.arraymath;

import java.util.ArrayList;
import java.util.List;

public class RepeatAndMissingNumberArray {

    /*
    You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4
     */

    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        ArrayList<Integer> output = new ArrayList<>();
        List<Integer> mylist = new ArrayList<>(a);
        int appeartwice = -1;
        int missed = -1;
        for (int i = 0; i < mylist.size(); i++) {
            while (mylist.get(i) != i + 1) {
                int value = mylist.get(i);
                if (value == mylist.get(mylist.get(i) - 1)) {
                    appeartwice = mylist.get(value - 1);
                    missed = i;
                    break;
                }
                int temp = mylist.get(i);
                mylist.set(i, mylist.get(value - 1));
                mylist.set(value - 1, temp);
            }
        }
        output.add(appeartwice);
        output.add(missed + 1);
        return output;

    }
}
