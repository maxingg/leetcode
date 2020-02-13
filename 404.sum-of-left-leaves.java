/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
    // 处理流程很简单, 是左叶子结点就加上
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return 0;
        return ((root.left != null && root.left.left == null && root.left.right == null) ? root.left.val : 0) + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
// @lc code=end

