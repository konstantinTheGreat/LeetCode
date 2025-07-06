package easy;

public class _492 {

    public int[] constructRectangle(int area) {
        int divisor = 2;
        int width = 1;
        int length = 1;
        int minDifference = area - 1;
        while (divisor <= area / 2) {
            if (area % divisor == 0 && Math.abs(area / divisor - divisor) < minDifference ) {
                width = divisor;
                length = area / divisor;
                minDifference = Math.abs(length - width);
            }
            divisor += 1;
        }
        if (minDifference == area - 1) {
            length = area;
            width = 1;
        }
        if (width > length) {
            int temp = width;
            width = length;
            length = temp;
        }

        return new int[]{length, width};
    }
}


// there is a quicker solution