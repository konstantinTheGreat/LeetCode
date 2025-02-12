import java.util.Hashtable;

public class _242 {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> dictionary = new Hashtable<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if (!dictionary.containsKey(letter)){
                dictionary.put(letter, 1);
            } else {
                dictionary.replace(letter,dictionary.get(letter) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            char letter = t.charAt(i);
            if (dictionary.containsKey(letter)){
                dictionary.replace(letter,dictionary.get(letter) - 1);
                if(dictionary.get(letter) == 0) {
                    dictionary.remove(letter);
                }
            } else {
                return false;
            }
        }

        return dictionary.isEmpty();

    }
}
