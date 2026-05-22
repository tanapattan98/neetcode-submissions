class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        const sArray: string[] = Array.from(s);
        const tArray: string[] = Array.from(t);

        if (sArray.sort().join("") === tArray.sort().join("")) {
            return true;
        }

        return false;
    }
}
