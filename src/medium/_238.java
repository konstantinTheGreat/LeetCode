package medium;

public class _238 {

    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int prefix = 1;

        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = prefix * nums[i - 1];
            prefix = result[i];
        }

        int suffix = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] = suffix * result[i];
            suffix *= nums[i];
        }
        return result;
    }
}
      /*  1 2 3 4
        1 1 2 6
        24 12 8 6 */

/*
Given an integer array nums, return an array answer such that answer[i] is equal
to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
 */