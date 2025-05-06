package easy;

import java.util.Arrays;

public class _455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieCount = 0;
        int result = 0;
        for (int j : g) {
            while (cookieCount < s.length) {
                if (j <= s[cookieCount]) {
                    result++;
                    cookieCount++;
                    break;
                }
                cookieCount++;
            }
        }

        return result;
    }
}
