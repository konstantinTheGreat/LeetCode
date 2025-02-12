public class _338 {
    class Solution {
        public int[] countBits(int n) {

            int[] answer = new int[n + 1];
            int count = 0;

            while (count <= n) {
                answer[count] = Integer.bitCount(count);
                count++;
            }
            return answer;
        }
    }
}
