class _191 {
    fun hammingWeight(n: Int): Int {
        var count = 0

        while (n > 0) {

            if (n % 2 == 1) {
                count++;
            }

            n =/ 2;
        }

        return count;
    }
}