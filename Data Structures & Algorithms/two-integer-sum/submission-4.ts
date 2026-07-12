class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        const seen = new Map();

        for (let i = 0; i < nums.length; i++) {
            if (seen.has(nums[i])) {
                return [seen.get(nums[i]), i];
            } else {
                seen.set(target - nums[i], i);
            }
        }

        return [0, 0];
    }
}
