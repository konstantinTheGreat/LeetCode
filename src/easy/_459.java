package easy;

public class _459 {
    public boolean repeatedSubstringPattern(String s) {
        int left = 0;
        int right = 1;

        while (right <= s.length() / 2) {
            int start = left;
            int end = right;
            while (end <= s.length()) {
                if (!s.substring(start, end).equals(s.substring(left, right))) {
                    break;
                } else if (end == s.length()){
                    return true;
                }
                start += right;
                end += right;
            }

            right++;
        }

        return false;
    }
}
