/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    // public int minDepth(TreeNode root) {
    //     //处理情况有两种
    //     //1. 左右子树至少有一个为空,返回当前树的高度应该是 0 + 0 /非零子树高度 + 1
    //     //2. 左右子树都不为空,则放回当前树的高估为较小子树高度 + 1
    //     if(root == null)
    //         return 0;
    //     if(root.left == null)
    //         return minDepth(root.right) + 1;
    //     if(root.right == null)
    //         return minDepth(root.left) + 1;
    //     return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    // }

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int depth = 1;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while(!nodes.isEmpty()) {
            int size = nodes.size();
            for(int i = 0; i < size; i++) {
                TreeNode curNode = nodes.poll();
                if(curNode.left == null && curNode.right == null)
                    return depth;
                if(curNode.left != null)
                    nodes.offer(curNode.left);
                if(curNode.right != null)
                    nodes.offer(curNode.right);
            }
            depth++;
        }
        return depth;
    }
}
// @lc code=end

