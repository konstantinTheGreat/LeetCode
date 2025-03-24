package easy;

public class _new338 {
    public int[] countBits(int n) {
        int [] resultArray = new int[n + 1];

        for (int i = 0; i < resultArray.length; i++) {
            int count = 0;
            System.out.println(i);
            for (int j = 0; j < i; j++) {

                if ((i >> j & 1) == 1) {
                    count++;
                }
            }

            resultArray[i] = count;
        }

        return resultArray;
    }
}
