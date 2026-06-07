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

        let s = 0;
        let e = 0;
        let rooms = 0;
        let minRooms = 0;

        while (s < intervals.length) {
            if (start[s] < end[e]) {
                s++
                rooms++;
                minRooms = Math.max(minRooms, rooms);
            } else {
                e++;
                rooms--;
            }
        }

        return minRooms;
    }
}
