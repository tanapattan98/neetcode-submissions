class Solution {
    /**
     * @param {number[][]} intervals
     * @return {number}
     */
    eraseOverlapIntervals(intervals: number[][]): number {
        intervals.sort((a, b) => a[0] - b[0]);

        console.log(intervals);

        let prevEnd = intervals[0][1];
        let result = 0;

        for (let i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                result++;
                prevEnd = Math.min(intervals[i][1], prevEnd);
            } else {
                prevEnd = intervals[i][1];
            }
        }

        return result;
    }
}
