package easy;

import java.util.HashMap;
import java.util.Map;

public class _496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> greaterElements = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[i] < nums2[j]) {
                    greaterElements.put(nums2[i], nums2[j]);
                    break;
                }
            }
            if (!greaterElements.containsKey(nums2[i])) {
                greaterElements.put(nums2[i], -1);
            }
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = greaterElements.get(nums1[i]);
        }

        return result;
    }
}

// use monotonic stack for ( O(nums2.length + nums1.length) ) , right now its n^2
