class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        const sArray = s.split("").sort();
        const tArray = t.split("").sort();
        
        return sArray.join("") === tArray.join("");
    }
}
