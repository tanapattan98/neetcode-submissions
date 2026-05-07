class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        List<Integer> valueOrderedByFrequency = new ArrayList<>(map.keySet());
        valueOrderedByFrequency.sort((a, b) -> map.get(b) - map.get(a));

        return valueOrderedByFrequency.stream().limit(k).mapToInt(Integer::intValue).toArray();
    }
}
