class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        if (s.length != t.length) return false;
        
        const sArray = s.split("").sort();
        const tArray = t.split("").sort();
        
        return sArray.join("") === tArray.join("");
    }
}
