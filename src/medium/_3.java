package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class    _3 {

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            int length = 0;
            int lengthOfLongest = 0;
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    if (length < map.get(s.charAt(i)) + 1){
                        length = map.get(s.charAt(i)) + 1;
                    }
                }
                map.put(s.charAt(i), i);
                if (i - length + 1 > lengthOfLongest) {
                    lengthOfLongest = i - length + 1;
                }

            }
            return lengthOfLongest;
        }
    }
}
