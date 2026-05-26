class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int newStart = newInterval[0];
            int newEnd = newInterval[1];

            
            if (newEnd < intervals[i][0]) {
                // new interval end is before the first interval start, so just add to first and add the rest
                res.add(newInterval);
                for (int j = i; j < intervals.length; j++) {
                    res.add(intervals[j]);
                }
                return res.toArray(new int[res.size()][]);
            } else if (newStart > intervals[i][1]) {
                // new interval start is after current interval iteration end, means there's no overlapping so add current interval to result
                res.add(intervals[i]); 
            } else {
                newInterval[0] = Math.min(newStart, intervals[i][0]);
                newInterval[1] = Math.max(newEnd, intervals[i][1]);
            }
        }

        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}