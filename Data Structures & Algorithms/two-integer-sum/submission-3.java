class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementary = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (complementary.containsKey(remaining)) {
                return new int[]{complementary.get(remaining), i};
            }
            complementary.put(nums[i], i);
        }

        return new int[5];
    }
}
