class Solution {
    public int maxProfit(int[] prices) {
        // o(n) complexity solution
        // loop through array from right
        // hold largest item we've seen from right in one slot
        // hold max profit in one slot
        // if largest item - current item > max profit, update max profit
        int maxProfit = 0;
        int highestPriceIndex = prices.length - 1;
        for (int i = prices.length - 1; i > -1; i--) {
            if (prices[i] > prices[highestPriceIndex]) {
                highestPriceIndex = i;
            }
            if (prices[highestPriceIndex] - prices[i] > maxProfit) {
                maxProfit = prices[highestPriceIndex] - prices[i];
            }
        }
        return maxProfit;
    }
}
