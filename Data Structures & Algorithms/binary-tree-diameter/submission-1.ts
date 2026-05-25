/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @return {number}
     */

    private result = 0;

    diameterOfBinaryTree(root: TreeNode | null): number {
        this.result = 0;
        this.dfs(root);
        return this.result;
    }

    private dfs(curr: TreeNode | null): number {
        if (curr === null) return 0;

        const left = this.dfs(curr.left);
        const right = this.dfs(curr.right);

        this.result = Math.max(this.result, left + right);

        return Math.max(left, right) + 1;
    } 


}
