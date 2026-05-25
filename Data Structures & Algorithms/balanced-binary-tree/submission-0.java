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
    public boolean isBalanced(TreeNode root) {
        Map.Entry<Boolean, Integer> result = dfs(root);

        return result.getKey();
    }

    private Map.Entry<Boolean, Integer> dfs(TreeNode current) {
        if (current == null) return Map.entry(true, 0);

        Map.Entry<Boolean, Integer> left = dfs(current.left);
        Map.Entry<Boolean, Integer> right = dfs(current.right);

        int heightDifference = Math.abs(left.getValue() - right.getValue());

        boolean balance = heightDifference <= 1 && left.getKey() && right.getKey();

        return Map.entry(balance, 1 + Math.max(left.getValue(), right.getValue()));
    }
}
