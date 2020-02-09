/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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

    //二叉树镜像的规律:左左-右右, 左右-右左
    // public boolean isSymmetricHelp(TreeNode left, TreeNode right) {
    //     if(left == null || right == null)
    //         return left == right;
    //     if(left.val != right.val)
    //         return false;
    //     return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    // }
    // public boolean isSymmetric(TreeNode root) {
    //     return root == null || isSymmetricHelp(root.left, root.right);
    // }

    //处理的思路和上面是一样的,区别在于利用栈的特性放置对称结点,实现了迭代
    // public boolean isSymmetric(TreeNode root) {
    //     if(root == null)
    //         return true;
    //     Stack<TreeNode> stack = new Stack<>();
    //     stack.push(root.left);
    //     stack.push(root.right);
    //     while(!stack.empty()) {
    //         TreeNode n1 = stack.pop(), n2 = stack.pop();
    //         if(n1 == null && n2 == null)
    //             continue;
    //         else if(n1 == null || n2 == null || n1.val != n2.val)
    //             return false;
    //         stack.push(n1.left);
    //         stack.push(n2.right);
    //         stack.push(n1.right);
    //         stack.push(n2.left);
    //     }
    //     return true;
    // }
}
// @lc code=end

