class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet(nums.length * 2);

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            } 
        }
        return false;
    }
}