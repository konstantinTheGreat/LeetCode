package medium;

public class _11 {
    public int maxArea(int[] height ) {
        int left = 0;
        int right = height.length;
        int result = 0;

        while (left <= right) {
            int area = 0;
            if (height[left] >= height[right - 1]) {
                area = height[right - 1] * (right - left);
                right--;
            } else {
                area = height[left] * (right - left);
                left++;
            }
            if (area > result) {
                result = area;
            }
        }
        return result;
    }
}


/*
You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0)
and (i, height[i]).

Find two lines that together with the x-axis form a container,
 such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 */