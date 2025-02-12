import java.util.HashMap;

public class _2062 {

    class Solution {
        public int countVowelSubstrings(String word) {
            int result = 0;

            HashMap<Character, Integer> map = new HashMap<>();
            map.put('a', 0);
            map.put('e', 0);
            map.put('i', 0);
            map.put('0', 0);
            map.put('u', 0);
            int right = 0;
            int left = right;
            while (right < word.length() - 4) {

                while (map.containsKey(word.charAt(left))){
                    map.put(word.charAt(left), map.get(word.charAt(left)) + 1);
                    left++;
                    if (!map.containsValue(0)) {
                        result++;
                    }
                }

                map.replaceAll((k, v) -> 0);
            }


            return result;
        }
    }
}
