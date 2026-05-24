class Solution {
    public int findMin(int[] nums) {
        int i = Integer.MAX_VALUE;
        for (int num : nums) {
            i = Math.min(num, i);
        }

        return i;
    }
}
