class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(nums: number[]): number {
        let low = 0;
        let high = nums.length - 1;
        let result = nums[0];

        while (low <= high) {
            if (nums[low] < nums[high]) {
                result = Math.min(result, nums[low]);
                break;
            }

            const middle = low + Math.floor((high - low) / 2);
            result = Math.min(result, nums[middle]);

            if (nums[middle] >= nums[low]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return result;
    }
}
