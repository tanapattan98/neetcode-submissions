class Solution {
    /**
     * @param {number[][]} intervals
     * @param {number[]} newInterval
     * @return {number[][]}
     */
    insert(intervals: number[][], newInterval: number[]): number[][] {
        const result: number[][] = [];
        
        for (let i = 0; i < intervals.length; i++) {
            if (newInterval[1] < intervals[i][0]) {
                result.push(newInterval);
                result.push(...intervals.slice(i));
                return result;
            } else if (newInterval[0] > intervals[i][1]) {
                result.push(intervals[i]);
            } else{
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }
        result.push(newInterval);
        return result;
    }
}
