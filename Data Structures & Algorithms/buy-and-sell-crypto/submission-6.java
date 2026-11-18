class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1 || prices.length >= 100) {
            return 0;
        }

        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minVal = Math.min(price, minVal);
            maxProfit = Math.max(price - minVal, maxProfit);
        }
        return maxProfit;
    }
}
