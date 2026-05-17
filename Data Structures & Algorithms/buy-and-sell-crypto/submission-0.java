class Solution {
    public int maxProfit(int[] prices) {
        int bestPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            int originalPrice = prices[i];
            
            for (int j = i + 1; j < prices.length; j++) {
                int sellingPrice = prices[j];
                if (bestPrice < (sellingPrice - originalPrice)) {
                    bestPrice = sellingPrice - originalPrice;
                }
            }
        }

        return bestPrice;        
    }
}
