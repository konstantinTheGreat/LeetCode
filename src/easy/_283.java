package easy;

public class _283 {
    public void moveZeroes(int[] nums) {
        
        int arrayNumber = 0;
        int i = 0;
        int zeroesCount = 0;
        while (arrayNumber + zeroesCount < nums.length) {
            if (nums[i] == 0) {
                i++;
                zeroesCount++;
                continue;
            }
            if (arrayNumber < i) {
                nums[arrayNumber] = nums[i];
                nums[i] = 0;
            }
            i++;
            arrayNumber++;
        }
    }
}
