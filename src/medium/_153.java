package medium;

public class _153 {

    public int findMin(int[] nums) {

        int left = 0;

        int right = nums.length - 1;

        int mid = nums.length / 2;

        while (left < right) {
            if (nums[mid] < nums[right]) {
                right = mid;
                mid = (left + mid) / 2;
                continue;
            }
            if (nums[left] > nums[right]) {
                left = mid;
                mid = (mid + right + 1) / 2;
            } else {
                right = mid;
                mid = (mid + left) / 2;
            }
        }

        return nums[mid];
    }
}
