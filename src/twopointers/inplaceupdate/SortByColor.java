package twopointers.inplaceupdate;

import java.util.ArrayList;

public class SortByColor {

    /*
       Given an array with n objects colored red, white or blue, 
       sort them so that objects of the same color are adjacent, 
       with the colors in the order red, white and blue.

       Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

       Note: Using library sort function is not allowed.

       Example :

       Input : [0 1 2 0 1 2]
       Modify array so that it becomes : [0 0 1 1 2 2]
     */
    public void sortColors(ArrayList<Integer> a) {
        int first = 0, second = 0, third = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 0) {
                first++;
            } else if (a.get(i) == 1) {
                second++;
            } else {
                third++;
            }
        }
        for (int i = 0; i < first; i++) {
            a.set(i, 0);
        }
        for (int j = first; j < first + second; j++) {
            a.set(j, 1);
        }
        for (int k = first + second; k < first + second + third; k++) {
            a.set(k, 2);
        }

    }
}
