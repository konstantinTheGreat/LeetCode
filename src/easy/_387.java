package easy;

import java.util.HashMap;
import java.util.Map;

public class _387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        characterCount(s ,charCount);

        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return 0;
    }
    public static void characterCount(String str, Map<Character,Integer> map) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
    }
    /* Given a string s, find the first non-repeating character in it and return its index.
      If it does not exist, return -1. */

}
