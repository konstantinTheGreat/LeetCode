package medium;

import java.util.HashMap;
import java.util.HashSet;

public class _424 {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 1);

        int startIndex = 0;
        int length = 0;
        int swaps = k;

        for (int i = 1; i < s.length(); i++) {

            map.merge(s.charAt(i), 1, Integer::sum);
            if (s.charAt(startIndex) != s.charAt(i)) {
                if (swaps <= 0 ) {
                    map.merge(s.charAt(startIndex), -1, Integer::sum);
                    startIndex++;
                    swaps = k + map.get(s.charAt(startIndex)) + startIndex + 1 - i;
                } else {
                    swaps--;
                }
            }
            if (length < i - startIndex ){
                length = i - startIndex + 1;
            }
        }

        return Math.min(length, s.length());

        
    }
}
