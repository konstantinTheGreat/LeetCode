package easy;

public class _121 {

/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing
a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction.
 If you cannot achieve any profit, return 0. */

    public int maxProfit(int[] prices) {

        int minDay = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minDay) {
                minDay = prices[i];
            }

            if (prices[i] - minDay > profit) {
                profit = prices[i] - minDay;
            }
        }

        return profit;

    }
}
