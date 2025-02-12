public class _344 {
    class Solution {
        public void reverseString(char[] s) {


            for (int i = s.length - 1; i >= 0; i--) {
                int length = s.length - i - 1;
                char temp = s[i];

                if (i <= length) {
                    break;
                }

                s[i] = s[length];
                s[length] = temp;

            }
        }
    }
}
