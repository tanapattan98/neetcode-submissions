class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        int result = high + 1;

        while (low <= high) {
            int k = low + (high - low) / 2;
            int totalHours = 0;
            for (int i = 0; i < piles.length; i++) {
                totalHours += (piles[i] + k - 1) / k;
            }

            if (totalHours <= h) {
                result = Math.min(result, k);
                high = k - 1;
            } else {
                low = k + 1;
            }
        }

        return result;
    }
}
