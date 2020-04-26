/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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
    //DFS, 问题规模过大可能造成堆栈溢出
    // public TreeNode invertTree(TreeNode root) {
    //     if(root == null)
    //         return null;
        
    //     final TreeNode left = root.left;
    //     root.left = invertTree(root.right);
    //     root.right = invertTree(left);
    //     return root;
    // }

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;

        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
        return root;
    }
}
// @lc code=end

