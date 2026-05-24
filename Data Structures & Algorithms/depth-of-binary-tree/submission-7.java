/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    // DFS
    // public int maxDepth(TreeNode root) {
    //     if (root == null) return 0;

    //     int base = 0;
    //     int resutlt = 0;
        
    //     return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    // }

    // // Iterative BFS
    // public int maxDepth(TreeNode root) {
    //     if (root == null) return 0;

    //     int level = 0;
    //     Deque<TreeNode> queue = new ArrayDeque<>();
    //     queue.addFirst(root);
    //     while (!queue.isEmpty()) {
    //         int levelSize = queue.size();
    //         for (int i = 0; i < levelSize; i++) {
    //             TreeNode node = queue.removeFirst();
    //             if (node.left != null) {
    //                 queue.addLast(node.left);
    //             }

    //             if (node.right != null) {
    //                 queue.addLast(node.right);
    //             }
    //         }
    //         level += 1;
    //     }

    //     return level;
    // }

        // Iterative DFS
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        record Frame(TreeNode node, int depth) {}

        Deque<Frame> stack = new ArrayDeque<>();
        stack.push(new Frame(root, 1));
        int result = 1;

        while (!stack.isEmpty()) {
            Frame f = stack.pop();
            result = Math.max(result, f.depth());

            if (f.node().left != null) {
                stack.push(new Frame(f.node().left, f.depth() + 1));
            }
            if (f.node().right != null) {
                stack.push(new Frame(f.node().right, f.depth() + 1));
            }
        }

        return result;
    }
}
