class Solution {
    /**
     * @param {number[][]} intervals
     * @return {number}
     */
    eraseOverlapIntervals(intervals: number[][]): number {
        intervals.sort((a, b) => a[1] - b[1]);
        console.log(intervals);

        let prevEnd = intervals[0][1];
        let result = 0;

        for (let i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                result++;
            } else {
                prevEnd = intervals[i][1];
            }
        }
        return result;
    }
}
