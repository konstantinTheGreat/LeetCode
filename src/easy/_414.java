package easy;

public class _414 {

    public int thirdMax(int[] nums) {
        if (nums.length >= 3) {
            double firstMax = 0.1;
            double secondMax = 0.1;
            double thirdMax = 0.1;

            for (int num : nums) {
                if (firstMax == 0.1 || num > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = num;
                } else if (secondMax == 0.1 && num != firstMax || num > secondMax && num != firstMax) {
                    thirdMax = secondMax;
                    secondMax = num;
                } else if (thirdMax == 0.1 && num != secondMax && num != firstMax
                        || num > thirdMax && num != secondMax && num != firstMax) {
                    thirdMax = num;
                }
            }
            if (thirdMax == 0.1) {
                return (int) firstMax;
            }
            return (int) thirdMax;
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            return nums[0];
        }


    }
    /* Given an integer array nums, return the third distinct maximum number in this array.
        If the third maximum does not exist, return the maximum number.
     */
}
