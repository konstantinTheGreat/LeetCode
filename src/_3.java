import java.util.HashSet;
import java.util.Set;

public class _3 {

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int length = 0;
            for (int i = 0; i < s.length(); i++) {
                int k = i;
                while (!set.contains(s.charAt(i))) {
                    set.add(s.charAt(k));
                    k++;
                }
                if (length < set.size()) {
                    length = set.size();
                }
                set.clear();
            }
            return length;
        }                       // use sliding window technique
    }
}
