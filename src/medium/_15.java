package medium;

import java.util.*;

public class _15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int right = i + 2;
            int left = i + 1;
            while (left < nums.length) {
                if (right == nums.length) {
                    left++;
                    right = left + 1;
                    continue;
                }
                if (nums[i] + nums[left] + nums[right] == 0 ) {
                    List<Integer> sumToZero = new ArrayList<>();
                    sumToZero.add(nums[i]);
                    sumToZero.add(nums[left]);
                    sumToZero.add(nums[right]);
                    result.add(sumToZero);
                }
                right++;
            }

        }

        return new ArrayList<>(result);
    }
}


/*
Given an integer array nums,
return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */