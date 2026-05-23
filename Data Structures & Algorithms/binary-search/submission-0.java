class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int valueAtPosition = nums[middlePosition];

            if (target == valueAtPosition) {
                return middlePosition;
            } else if (target < valueAtPosition) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }

        return -1;
    }
}
