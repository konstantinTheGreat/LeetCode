package easy;

public class _263 {

        public boolean isUgly(int n) {

            for (int i = 2; i < 6; i++) {
                while(n % i == 0) {
                    n /= i;
                }
            }

            return n == 1;
        }
}

