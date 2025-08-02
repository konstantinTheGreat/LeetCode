package easy;

public class _test {
    public static int[] simulate(int[] entries, int s) {

        int l = 0;
        int r = entries.length - 1;

        while (l < s && l < r) {
            entries[l] = - 1;
            entries[r] = - 1;
            l++;
            r--;
        }

        return entries;

    }
}
