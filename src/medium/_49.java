package medium;

/* Given an array of strings strs, group the anagrams together.
You can return the answer in any order.
 */

import java.util.*;

public class _49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        String[] input = strs.clone();

        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            input[i] = new String(charArray);
        }

        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            map.computeIfAbsent(input[i], k -> new ArrayList<>()).add(i);
        }
        char i = '1';

        for (List<Integer> value : map.values()) {
            List<String> temp = new ArrayList<>();
            for (int i : value) {
                temp.add(strs[i]);
            }
            result.add(temp);
        }

        return result;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        String[] input = strs.clone();

        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            input[i] = new String(charArray);
        }

        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            map.computeIfAbsent(input[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> value : map.values()) {
            List<String> temp = new ArrayList<>();
            for (int i : value) {
                temp.add(strs[i]);
            }
            result.add(temp);
        }

        return result;
    }
}

/* better solution
import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store groups of anagrams, where the key is the character count
        Map<String, List<String>> map = new HashMap<>();

        // Iterate over each string in the input array
        for (String str : strs) {
            // Create a character count array for the current string
            int[] count = new int[26]; // assuming only lowercase English letters
            for (char c : str.toCharArray()) {
                count[c - 'a']++;  // Increment the count of the character
            }

            // Convert the character count array to a string key
            StringBuilder key = new StringBuilder();
            for (int c : count) {
                key.append('#');  // Use a separator to avoid collisions
                key.append(c);
            }

            // Add the current string to the corresponding group in the map
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(str);
        }

        // Return the groups of anagrams
        return new ArrayList<>(map.values());
    }
}

*/


