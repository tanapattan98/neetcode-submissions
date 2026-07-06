class Solution {
    /**
     * @param {number[][]} intervals
     * @return {number[][]}
     */
    merge(intervals: number[][]): number[][] {
        intervals.sort((a,b) => a[0] - b[0]);
        const result: number[][] = [];
        result.push(intervals[0]);

        for (let i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= result[result.length - 1][1]) {
                result[result.length - 1][0] = Math.min(result[result.length - 1][0], intervals[i][0]);
                result[result.length - 1][1] = Math.max(result[result.length - 1][1], intervals[i][1]);
            } else {
                result.push(intervals[i]);
            }
        }

        return result;
    }
}
