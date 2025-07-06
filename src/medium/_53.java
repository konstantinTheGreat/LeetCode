package medium;

public class _53 {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (currentSum + nums[i] < nums[i]) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }


        return maxSum;
    }
}
