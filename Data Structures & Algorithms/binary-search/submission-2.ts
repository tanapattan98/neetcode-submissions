class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    search(nums: number[], target: number): number {
        let low = 0;
        let high = nums.length - 1;

        while (low <= high) {
            console.log("----Start-----");
            console.log("low = " + low);
            console.log("high = " + high);
            const middlePosition = low + Math.floor((high - low) / 2);
            const valueAtMiddlePosition = nums[middlePosition];
            console.log("middlePosition = " + middlePosition);
            console.log("valueAtMiddlePosition = " + valueAtMiddlePosition);

            if (target === valueAtMiddlePosition) {
                return middlePosition;
            } else if (target < valueAtMiddlePosition) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }

        return -1;
    }
}
