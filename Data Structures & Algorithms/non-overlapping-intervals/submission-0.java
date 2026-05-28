class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int prevEnd = intervals[0][1];
        int result = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                result++;
            } else {
                prevEnd = intervals[i][1];
            }
        }


        return result;
    }
}
