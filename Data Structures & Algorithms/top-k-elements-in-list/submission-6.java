class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> valueToCountMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            valueToCountMap.put(value, valueToCountMap.getOrDefault(value, 0) + 1);
        }

        List<Integer>[]  buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> valueToCount : valueToCountMap.entrySet()) {
            int count = valueToCountMap.get(valueToCount.getKey());
            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }

            buckets[count].add(valueToCount.getKey());
        }
        
        int[] result = new int[k];

        int index = 0;
        for (int j = buckets.length - 1; j >= 0 && index < k; j--) {
            if (buckets[j] != null) {
                for (int num : buckets[j]) {
                    result[index++] = num;
                    if (index == k ) break;
                }
            }
        }
        return result;
    }
}
