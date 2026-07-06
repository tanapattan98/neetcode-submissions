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

        for (let i = 0; i < intervals.length; i++) {
            start.push(intervals[i].start);
            end.push(intervals[i].end);
        }

        start.sort((a, b) => a - b);
        end.sort((a, b) => a - b);

        let s = 0;
        let e = 0;
        let minRoom = 0;
        let counter = 0;

        while (s < intervals.length) {
            if (start[s] < end[e]) {
                s++;
                counter++;
                minRoom = Math.max(minRoom, counter);
            } else {
                e++;
                counter--;
            }
        }

        return minRoom;
    }
}
