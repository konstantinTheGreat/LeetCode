package medium;

public class _55 {
    public boolean canJump(int[] nums) {

        int furthest = nums[0];
        int lastIndex = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0 && i >= furthest) {
                return false;
            } else if (furthest >= lastIndex){
                return true;
            }
            if (nums[i] + i > furthest) {
                furthest = nums[i] + i;
            }

        }
        return true;
    }
}
