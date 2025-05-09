package easy;

public class _278 {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int result = 0;
        while(start < end) {
            int middle = start + (end-start) / 2;
            boolean isBad = isBadVersion(middle);
            if (isBad && isBadVersion(middle - 1)){
                end = middle;
            } else if (!isBad && !isBadVersion(middle + 1)) {
                start = middle + 1;
            } else {
                result = isBad ? middle : middle + 1;
                break;
            }
        }

        return result;
    }
}
