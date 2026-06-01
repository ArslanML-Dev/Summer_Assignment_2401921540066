

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Track the lowest price so far
        int maxProfit = 0;                 // Track the maximum profit

        for (int price : prices) {
            // Update the minimum price if current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if sold today
            int profit = price - minPrice;
            // Update maxProfit if this profit is greater
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
