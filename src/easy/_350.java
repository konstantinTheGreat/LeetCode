package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _350   {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for (int number : nums1) {
            numCount.put(number, numCount.getOrDefault(number, 0) + 1);
        }
        int k = 0;
        for (int j : nums2) {
            if (numCount.containsKey(j) && numCount.get(j) > 0) {
                resultList.add(j);
                numCount.put(j, numCount.get(j) - 1);
                k += 1;
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
