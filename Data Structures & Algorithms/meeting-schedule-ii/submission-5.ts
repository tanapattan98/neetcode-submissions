/**
 * Definition of Interval:
 * class Interval  {
 *   constructor(start, end) {
 *     this.start = start;
 *     this.end = end;
 *   }
 * }
 */

class Solution {
    /**
     * @param {Interval[]} intervals
     * @returns {number}
     */
    minMeetingRooms(intervals: Interval[]): number {
        const start: number[] = [];
        const end: number[] = [];

        for (const interval of intervals) {
            start.push(interval.start);
            end.push(interval.end);
        }

        start.sort((a,b) => a - b);
        end.sort((a,b) => a - b);

        let rooms = 0;
        let i = 0;
        let j = 0;
        let result = 0;

        while (i < intervals.length) {
            if (start[i] < end[j]) {
                rooms++;
                i++;
                result = Math.max(rooms, result);
            } else {
                rooms--;
                j++;
            }
        }


        return result;
    }
}
