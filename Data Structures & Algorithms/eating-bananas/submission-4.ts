class Solution {
    /**
     * @param {number[]} piles
     * @param {number} h
     * @return {number}
     */
    minEatingSpeed(piles: number[], h: number): number {
        let low = 1;
        let high = 0;
        for (const pile of piles) {
            high = Math.max(pile, high);
        }
        let result = high + 1;

        while (low <= high) {
            const k = low + Math.floor((high - low) / 2);
            let totalHours = 0;
            for (const pile of piles) {
                totalHours += Math.ceil(pile / k)
            }

            if (totalHours <= h) {
                high = k - 1;
                result = Math.min(result, k);
            } else {
                low = k + 1;
            }
        }

        return result;
    }
}
