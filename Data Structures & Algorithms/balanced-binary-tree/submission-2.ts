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
     * @return {boolean}
     */
    isBalanced(root: TreeNode | null): boolean {
        return this.dfs(root)[0];
    }

    private dfs(root: TreeNode | null): [balanced: boolean, height: number] {
        if (root === null) return [true, 0];

        const [leftBalanced, leftHeight] = this.dfs(root.left);
         if (!leftBalanced) return [false, 0];
        const [rightBalanced, rightHeight] = this.dfs(root.right);
        if (!rightBalanced) return [false, 0];

        const heightDifference = Math.abs(leftHeight - rightHeight);
        const isBalanced = heightDifference <= 1 && leftBalanced && rightBalanced;

        return [isBalanced, 1 + Math.max(leftHeight, rightHeight)];
    }
}
