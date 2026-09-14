class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int bestending = prices[0];
        int res = 0;

        for(int i=1; i<n; i++){
            int v = prices[i];
            bestending = Math.min(bestending, v);
            int profit = prices[i] - bestending;

            res = Math.max(res, profit);
        }
        return res;
    }
}