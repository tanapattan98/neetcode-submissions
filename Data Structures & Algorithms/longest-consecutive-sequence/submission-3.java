class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) continue;
            set.add(num);
        }

        // Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longest = 0;

        for(int i = 0; i < nums.length; i++){
            if (!set.contains(nums[i] - 1)) {
                int length = 0;
                while (set.contains(nums[i] + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}