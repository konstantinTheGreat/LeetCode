class Solution {
    public int missingNumber(int[] nums) {
        int missingNumberSum = 0;
        int neededSum = 0;
        for (int i = 0; i < nums.length; i++) {
            missingNumberSum += nums[i];
            neededSum += i;
        }
        if (neededSum == missingNumberSum) {
            return nums.length;
        }

        if (neededSum < missingNumberSum) {
            return neededSum - missingNumberSum + nums.length;
        }
        return neededSum - missingNumberSum;

    }
}