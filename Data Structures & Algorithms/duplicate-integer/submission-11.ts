class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        const usedNums: number[] = [];

        for (const num of nums) {
            if (usedNums.includes(num)) {
                return true;
            } else {
                usedNums.push(num);
            }
        }

        return false;
    }
}
