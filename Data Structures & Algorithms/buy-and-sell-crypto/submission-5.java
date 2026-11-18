class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1 || prices.length >= 100) {
            return 0;
        }

        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minVal) {
                minVal = price;
                } 
            else if (price - minVal > maxProfit) {
                maxProfit = price - minVal;
                }
        }
        return maxProfit;
    }
}
