package easy;

public class _342 {

    class Solution {
        public boolean isPowerOfFour(int n) {
            if (n == 0) {
                return false;
            }
            double threshold = 1e-10;
            int base = 4;

            double sum = Math.log(n) / Math.log(base);
            if (Math.abs(sum - Math.round(sum)) < threshold) {
                return true;
            }
            return false;
        }
    }
}
