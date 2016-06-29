package string.stringsearch;

public class ImplementStrStr {

    /*Please Note:

Another question which belongs to the category of questions which are intentionally stated vaguely. 
Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.

Implement strStr().

 strstr - locate a substring ( needle ) in a string ( haystack ). 
Try not to use standard library string functions for this question.

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 NOTE: Good clarification questions:
What should be the return value if the needle is empty?
What if both haystack and needle are empty?
For the purpose of this problem, assume that the return value should be -1 in both cases. 
     */
    public int strStr(final String haystack, final String needle) {
        int start = 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            start = i;
            int j = 0;
            while (i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                return start;
            }
            i = start;
        }
        return -1;
    }
}
