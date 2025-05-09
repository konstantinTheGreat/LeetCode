package easy;

public class _367 {
    public boolean isPerfectSquare(int num) {

        long k = 1;
        long j = num;

        while (k <= j) {
            long mid = k + (j - k) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                k = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return false;
    }
}

// 1 4 9 16 25 36 49 64 81 100


