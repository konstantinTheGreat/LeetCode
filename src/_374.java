public class _374  {
    public int guessNumber(int n) {
        int k = 1;
        int j = n;
        while (k <= j) {
            int mid = k + (j - k) / 2;
            int guess = guess(mid);

            if (guess == 0) {
                return mid;
            } else if (guess < 0) {
                j = mid - 1;
            } else {
                k = mid + 1;
            }
        }

        return k;
    }
}


// description

/* We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked. */