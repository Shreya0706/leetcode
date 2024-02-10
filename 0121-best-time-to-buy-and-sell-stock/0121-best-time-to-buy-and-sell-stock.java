class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // No profit can be made with less than 2 prices.
        }

        int maxProfit = 0;
        int buyPrice = prices[0]; // Initialize buyPrice with the first price.

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                int currentProfit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                buyPrice = prices[i]; // Update buyPrice if the current price is lower.
            }
        }

        return maxProfit;
    }
}