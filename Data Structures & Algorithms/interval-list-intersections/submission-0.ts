class Solution {
    /**
     * @param {number[][]} firstList
     * @param {number[][]} secondList
     * @return {number[][]}
     */
    intervalIntersection(
        firstList: number[][],
        secondList: number[][],
    ): number[][] {
        const result: number[][] = [];
        let i = 0;
        let j = 0;
        

        while (i < firstList.length && j < secondList.length) {
            const start = Math.max(firstList[i][0], secondList[j][0]);
            const end = Math.min(firstList[i][1], secondList[j][1]);

            if (start <= end) {
                result.push([start, end]);
            }

            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }


        return result;
    }
}
