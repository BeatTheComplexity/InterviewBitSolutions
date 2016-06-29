package string.stringsimulation;

public class PalindromeString {

    /*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem
     */
    public int isPalindrome(String a) {
        int i = 0;
        int j = a.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(a.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(a.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(a.charAt(i)) != Character.toLowerCase(a.charAt(j))) {
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
