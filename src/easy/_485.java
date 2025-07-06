package easy;

public class _485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutives = 0;
        int currectConsecutives = 0;

        for (int num : nums) {
            if (num == 1) {
                currectConsecutives += 1;
            } else if (maxConsecutives < currectConsecutives) {
                maxConsecutives = currectConsecutives;
                currectConsecutives = 0;
            } else {
                currectConsecutives = 0;
            }
        }

        return maxConsecutives;
    }

}
