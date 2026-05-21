class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> remainingToIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (remainingToIndexMap.containsKey(nums[i])) {
                return new int[] {remainingToIndexMap.get(nums[i]), i};
            }
            remainingToIndexMap.put(target - nums[i], i);
        }

        return new int[] {};
    }
}
