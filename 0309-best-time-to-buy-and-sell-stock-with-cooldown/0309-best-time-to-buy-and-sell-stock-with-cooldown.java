import java.util.*;

class Solution {

    public int maxProfit(int[] prices) {
        int n = prices.length;

        // dp[day][buy]
        // buy = 1 -> can buy
        // buy = 0 -> holding stock (can sell)
        int[][] dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(prices, 0, 1, dp);
    }

    private int helper(int[] prices, int day, int buy, int[][] dp) {

        if (day >= prices.length) return 0;

        if (dp[day][buy] != -1) return dp[day][buy];

        int profit;

        if (buy == 1) {
            // Option 1: Buy today
            int take = -prices[day] + helper(prices, day + 1, 0, dp);

            // Option 2: Skip today
            int notTake = helper(prices, day + 1, 1, dp);

            profit = Math.max(take, notTake);
        } else {
            // Option 1: Sell today (cooldown → day + 2)
            int sell = prices[day] + helper(prices, day + 2, 1, dp);

            // Option 2: Hold stock
            int notSell = helper(prices, day + 1, 0, dp);

            profit = Math.max(sell, notSell);
        }

        dp[day][buy] = profit;
        return profit;
    }
}
