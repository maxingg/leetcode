/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    //利用有序数组的方法使用二叉法递归构造确实没有想到。。。
    //此题须明白有序二叉树和折半查找的关系
    public TreeNode sortedArrayToBST(int[] nums) {
         if(nums.length == 0)
            return null;
        TreeNode head = helper(nums, 0, nums.length - 1);
        return head;
    }

    public TreeNode helper(int[] nums, int low, int high) {
        if(low > high)
            return null;
        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);
        return node;
    }
}
// @lc code=end

