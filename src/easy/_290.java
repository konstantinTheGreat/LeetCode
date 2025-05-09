package easy;

import java.util.*;

public class _290 {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> library = new HashMap<>();
        int sCharCount = 0;

        for (int i = 0; i < pattern.length(); i++) {
            if (s.length() <= sCharCount) {
                return false;
            }
            List<Character> wordInChar = new ArrayList<>();
            while (s.charAt(sCharCount) != ' ') {
                wordInChar.add(s.charAt(sCharCount));
                sCharCount++;
            }

            String wordInPattern = wordInChar.toString();
            if (library.containsKey(pattern.charAt(i))) {
                String wordInLibrary = library.get(pattern.charAt(i));
                if (!wordInLibrary.equals(wordInPattern)) {
                    return false;
                }
            } else {
                if (library.containsValue(wordInPattern)) {
                    return false;
                }
                library.put(pattern.charAt(i), wordInPattern);
            }
        }
        return sCharCount >= s.length();
    }

}
