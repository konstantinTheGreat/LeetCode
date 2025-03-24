package easy;

public class _434 {

    public int countSegments(String s) {
            if (s.length() == 1) {
                return s.charAt(0) == ' ' ? 0 : 1;
            }

            char emptyChar = ' ';

            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == emptyChar || i == 0) {
                    continue;
                } else if (s.charAt(i - 1) == emptyChar ) {
                    count++;
                }
            }

            return count;
    }

}


    /* Given a string s, return the number of segments in the string.

    A segment is defined to be a contiguous sequence of non-space characters.

     */
