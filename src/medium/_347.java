package medium;

import java.util.*;

public class _347 {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.compute(num, (key, val) -> (val == null) ? 1 : val + 1);
        }

        int[] result = new int[k];
        Arrays.fill(result, Integer.MIN_VALUE);
        int minValueIndex = minIndexOfArray(result);
        int[] finalResult = new int[k];

        for (int key : map.keySet()) {
            if (map.get(key) > result[minValueIndex]) {
                result[minValueIndex] = map.get(key);
                finalResult[minValueIndex] = key;
                minValueIndex = minIndexOfArray(result);
            }
        }

        return finalResult;
    }

    public int minIndexOfArray (int[] array) {
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }

        return min;
    }
}

/*
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.
 */