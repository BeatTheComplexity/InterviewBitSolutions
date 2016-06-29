package string.words;

public class ReverseTheString {

    /*Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
     */

    public String reverseWords(String a) {
        if (a == null || a.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] arr = a.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
