package easy;

public class _461 {
    public int hammingDistance(int x, int y) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            int xLsb = x & 1;
            int yLsb = y & 1;

            if (xLsb != yLsb) {
                count++;
            }
            x = x >> 1;
            y = y >> 1;
        }

        return count;

    }
}
