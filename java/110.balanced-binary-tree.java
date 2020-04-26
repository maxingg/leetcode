/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    //仿照计算树的深度来写,每个子函数也要实现递归,复杂度O(n2)(最坏情况)
    // public boolean isBalanced(TreeNode root) {
    //     if(root == null)
    //         return true;
    //     int leftDepth = helper(root.left);
    //     int rightDepth = helper(root.right);
    //     return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    // }

    // public int helper(TreeNode root) {
    //     if(root == null)
    //         return 0;
    //     int left = root.left == null ? 0 : helper(root.left);  
    //     int right = root.right == null ? 0 : helper(root.right);
    //     return 1 + Math.max(left, right);  
    // }

    //为了降低复杂度,我们争取只遍历一次树结点，为此必须在遍历结点时就能检查出他是否已经不平衡
    //通过-1的检验判断
    public int dfsHeight(TreeNode root) {
        if(root == null)
            return 0;
        int left = dfsHeight(root.left);
        if(left == -1)
            return -1;
        int right = dfsHeight(root.right);
        if(right == -1)
            return -1;
        if(Math.abs(left - right) > 1)
            return -1;
        return 1 + Math.max(left, right);   //结点平衡的话正常返回高度
    }

    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }
}
// @lc code=end

