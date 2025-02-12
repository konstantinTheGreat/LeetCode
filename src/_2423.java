import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _2423 {
    public boolean equalFrequency(String word) {
        HashMap <Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            charCount.put(character, charCount.getOrDefault(character, 0) + 1);
        }

        Set<Integer> freqSet = new HashSet<>(charCount.values());
        int [] freqArray = new int[freqSet.size()];

        if (freqSet.size() > 2) {
            return false;
        }

        for (int j = 0; j < word.length(); j++) {
            if (charCount.containsKey(j)) {
                charCount.remove(charCount.)
            }
            charCount.containsKey(j);
        }
        if (freqSet.size() == 2) {
            freqArray = freqSet.stream().mapToInt(Number::intValue).toArray();

            return Math.abs(freqArray[0] - freqArray[1]) <= 1;
        }
        return false;
    }

}
