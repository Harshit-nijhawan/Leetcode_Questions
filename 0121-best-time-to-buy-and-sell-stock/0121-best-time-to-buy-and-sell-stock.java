class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for(int i = 0;i<prices.length;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            profit = prices[i] - buy;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}