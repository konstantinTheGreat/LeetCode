package easy;

public class _434 {

    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i + 1 == s.length() || s.charAt(i + 1) == ' ' )) {
                count++;
            }

        }

        return count;
    }

}

    /* Given a string s, return the number of segments in the string.

    A segment is defined to be a contiguous sequence of non-space characters.

     */
