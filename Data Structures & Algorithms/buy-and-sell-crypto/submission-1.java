class Solution {
    // public int maxProfit(int[] prices) {
    //     int minPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for (int price : prices) {
    //         if (price < minPrice) {
    //             minPrice = price;
    //         } else if (price - minPrice > maxProfit) {
    //             maxProfit = price = minPrice;
    //         }
    //     }
    //     return maxProfit;
    // }

    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
