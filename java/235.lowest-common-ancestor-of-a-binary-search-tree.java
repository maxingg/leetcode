/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
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
    //有序二叉树的特点允许我们在这里直接比较值，实际上寻找最小父节点就是while循环中 <=0 的情况
    //简单理解就是最小父节点的值在p,q之间(包含p或q)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while((root.val - p.val) * (root.val - q.val) > 0)
            root = root.val < p.val ? root.right : root.left;
        return root;
    }
}
// @lc code=end

