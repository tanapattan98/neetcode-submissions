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

    // // Recursive DFS
    // maxDepth(root: TreeNode | null): number {

    //     if (root == null) return 0;

    //     return 1 + Math.max(this.maxDepth(root.left), this.maxDepth(root.right));

    // }

    // Iterative BFS
    maxDepth(root: TreeNode | null): number {

        if (root == null) return 0;

        const queue: TreeNode[] = [root];
        let depth = 0

        while(queue.length > 0) {
            const levelSize = queue.length;

            for (let i = 0; i < levelSize; i++) {
                const node = queue.shift();
                if (node.left) queue.push(node.left);
                if (node.right) queue.push(node.right);
            }

            depth++;
        }
        return depth;
    }
}
