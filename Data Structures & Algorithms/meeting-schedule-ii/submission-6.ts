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
        console.log(start);
        console.log(end);

        let s = 0;
        let e = 0;
        let rooms = 0;
        let minRooms = 0;

        while (s < intervals.length) {
            console.log("-----------");
            console.log("s: " + s + " value: " + start[s]);
            console.log("e: " + e + " value: " + end[e]);
            console.log("rooms: " + rooms);
            console.log("minRooms: " + minRooms);
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
