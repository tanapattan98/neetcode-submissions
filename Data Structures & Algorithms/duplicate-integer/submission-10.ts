class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        const array: number[] = [];

        for (const num of nums) {
            if (array.includes(num)) return true;
            array.push(num);
        }

        return false;
    }
}
