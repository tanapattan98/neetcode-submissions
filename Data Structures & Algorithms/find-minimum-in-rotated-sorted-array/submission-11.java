class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
             if (nums[low] < nums[high]) return nums[low];
            int middle = low + (high - low) / 2;
            int value = nums[middle];

            if (value >= nums[low]) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }

        return nums[low];
    }
}
