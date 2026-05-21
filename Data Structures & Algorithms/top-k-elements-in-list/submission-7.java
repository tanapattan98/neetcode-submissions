class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0) return new int[] {};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> valueOrderedByFrequency = new ArrayList<>(map.keySet());
        valueOrderedByFrequency.sort((a,b) -> map.get(b) - map.get(a));


        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = valueOrderedByFrequency.get(i);
        }
        return result;
    }
}
