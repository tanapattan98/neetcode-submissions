class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= result.get(result.size() - 1)[1]) {
                result.get(result.size() - 1)[0] = Math.min(intervals[i][0], result.get(result.size() - 1)[0]);
                result.get(result.size() - 1)[1] = Math.max(intervals[i][1], result.get(result.size() - 1)[1]);
            } else {{
                result.add(intervals[i]);
            }}
        }

        return result.toArray(new int[0][]);
    }
}
