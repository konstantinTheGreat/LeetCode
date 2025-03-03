package easy;

public class _392 {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;

        while (left < t.length()) {

            if (t.charAt(left) == s.charAt(right)) {
                right++;
            }
            if (right == s.length()) {
                return true;
            }
            left++;
        }

        return false;
    }
}


/* Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting
 some (can be none) of the characters without disturbing the relative positions of the
 remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */