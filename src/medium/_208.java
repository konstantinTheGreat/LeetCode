package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _208 {

    class Trie {

        private HashMap<String, List<String>> root = new HashMap<>();
        private int count = 0;
        public Trie() {
        }

        public void insert(String word) {
            root.put(word, new ArrayList<>());
        }

        public boolean search(String word) {
            return root.containsKey(word);
        }

        public boolean startsWith(String prefix) {
            for (String key : root.keySet()) {
                if (key.startsWith(prefix)) {
                    return true;
                }
            }
            return false;
        }

    }
}
