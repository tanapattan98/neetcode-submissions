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
        console.log(firstList);
        console.log(secondList);

        let i: number = 0;
        let j: number = 0;
        const result: number[][] = [];

        while (i < firstList.length && j < secondList.length) {
            const maxStart = Math.max(firstList[i][0], secondList[j][0]);
            const minEnd = Math.min(firstList[i][1], secondList[j][1]);

            if (maxStart <= minEnd) {
                result.push([maxStart, minEnd]);
            }

            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }


        // i = 0, firstList = [0,2], secondList = [1,5], maxStart = 1, minEnd = 2
        // result + [1,2], i++

        // i = 1, firstList = [5,10], secondList = [5,5], maxStart = 5, minEnd = 5
        // result + [5,5], j++

        // i = 2, firstList = [5,10], secondList = [8,12], maxStart = 8, minEnd = 10
        // result + [8,10], i++


        return result;
    }
}
