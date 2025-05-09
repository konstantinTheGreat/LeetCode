package easy;

import java.util.HashSet;
import java.util.Set;

public class _349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set <Integer> unique = new HashSet<>();

            Set <Integer> intersection = new HashSet<>();

            for (int value : nums1) {
                unique.add(value);
            }
            for (int i : nums2) {
                if (unique.contains(i)) {
                    intersection.add(i);
                }
            }
            int [] result = new int[intersection.size()];
            result = intersection.stream().mapToInt(Number::intValue).toArray();
            return result;
        }
    }
}
