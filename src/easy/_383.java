package easy;

import java.util.HashMap;
import java.util.Map;

public class _383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> ransomNoteCharCount = new HashMap<>();
        Map<Character, Integer> magazineCharCount = new HashMap<>();
        charCount(ransomNote, ransomNoteCharCount);
        charCount(magazine, magazineCharCount);

        for (Map.Entry<Character, Integer> entry : ransomNoteCharCount.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            if (magazineCharCount.getOrDefault(character, 0) < count) {
                return false;
            }
        }
        return true;
    }


    public static void charCount(String str, Map<Character, Integer> charCount) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            charCount.put(character, charCount.getOrDefault(character, 0) + 1);
        }
    }
}
