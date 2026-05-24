class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        if (nums.length == 0) return -1;

        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        while (low < high) {
            if (nums[low] < nums[high]) {
                break;
            }
            int middle = low + (high - low) / 2;
            int value = nums[middle];

            if (value >= nums[low]) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }

        int deflectionPoint = low;

        if (target >= nums[deflectionPoint] && target <= nums[nums.length - 1]) {
            low = deflectionPoint;
            high = nums.length - 1;
        } else {
            low = 0;
            high = deflectionPoint - 1;
        }


        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = nums[middle];

            if (target == value) {
                return middle;
            } else if (target < value) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;

    }
}
