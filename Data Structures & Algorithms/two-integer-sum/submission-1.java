class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arraySize = nums.length;
        HashMap<Integer, Integer> valueToIndexMap = new HashMap<>(arraySize * 2);
        for (int i = 0; i < arraySize; i++) {
            int complementValue = target - nums[i];
            if (valueToIndexMap.containsKey(complementValue)) {
                return new int[] {valueToIndexMap.get(complementValue), i};
            } 
            valueToIndexMap.put(nums[i], i);
        }

        throw new RuntimeException("No solution");
    }
}
