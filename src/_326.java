public class _326 {
    class Solution {
        public boolean isPowerOfThree(int n) {

            if (n == 0) {
                return false;
            }
            double threshold = 1e-10;
            double base = 3;

            double sum = Math.log(n) / Math.log(base);
            if (Math.abs(sum - Math.round(sum)) < threshold) {
                return true;
            }
            return false;
        }
    }
}
