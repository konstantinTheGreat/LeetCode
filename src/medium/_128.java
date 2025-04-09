package medium;

import java.util.*;

public class _128 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        int longest = 0;

        for(int num : nums) {
            numbers.add(num);
        }

        for (int num : numbers) {
            if (!numbers.contains(num - 1)) {
                int length = 1;
                while(numbers.contains(num + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
}

/* Given an unsorted array of integers nums,
 return the length of the longest consecutive elements  sequence.

 You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
Therefore its length is 4.

Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

Example 3:

Input: nums = [1,0,1,2]
Output: 3
 */




