/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + depth(root);
    }

    public int depth(TreeNode root) {
        int leftLen = root.left == null ? 0 : 1 + depth(root.left);
        int rightLen = root.right == null ? 0 : 1 + depth(root.right);
        return Math.max(leftLen, rightLen);
    }
}
// @lc code=end

