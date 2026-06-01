/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();

        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] start = new int[n];
        int[] end = new int[n];
        for (int i =0; i < n; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int counter = 0;
        int startCounter = 0;
        int endCounter = 0;
        int result = 0;

        while (startCounter < n) {
            if (start[startCounter] < end[endCounter]) {
                startCounter++;
                counter++;
                result = Math.max(result, counter);
            } else {
                endCounter++;
                counter--;
            }
        }


        return result;
    }
}

// [1, 1, 2, 5, 10, 15]
// [5, 6, 10, 15, 20, 20]


