package easy;

import java.util.HashSet;
import java.util.Set;

public class _345 {
    class Solution {
        public String reverseVowels(String s) {
            int left = 0, right = s.length() - 1;

            char[] arr = s.toCharArray();

            Set<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            vowels.add('A');
            vowels.add('E');
            vowels.add('I');
            vowels.add('O');
            vowels.add('U');

            char leftVowel = ' ';
            char rightVowel = ' ';

            while(left <= right) {
                if (vowels.contains(arr[left])) {
                    leftVowel = arr[left];
                }
                if (vowels.contains(arr[right])) {
                    rightVowel = arr[right];
                }
                if (leftVowel != ' ' && rightVowel!= ' ') {
                    arr[left] = rightVowel;
                    arr[right] = leftVowel;
                    left++;
                    right--;
                    leftVowel = ' ';
                    rightVowel = ' ';
                }
                if (leftVowel == ' ') {
                    left++;
                }
                if (rightVowel == ' ') {
                    right--;
                }
            }

            return new String(arr);
        }
    }
}
