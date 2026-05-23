class Solution {
    /**
     * @param {number[][]} matrix
     * @param {number} target
     * @return {boolean}
     */
    searchMatrix(matrix: number[][], target: number): boolean {
        const m = matrix.length;
        const n = matrix[0].length;

        let low = 0;
        let high = m * n - 1;

        while (low <= high) {
            const middle = Math.floor(low + (high - low) / 2);
            const value = matrix[Math.floor(middle / n)][middle % n];
            if (target == value) {
                return true;
            } else if (target > value) {
                low = middle +1;
            } else {
                high = middle - 1;
            }
        }
        return false;
    }
}
