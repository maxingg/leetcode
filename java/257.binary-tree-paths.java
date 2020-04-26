/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    /**
     * 递归方法的常规处理, 过于低效
     */
    // public List<String> binaryTreePaths(TreeNode root) {
    //     List<String> list = new ArrayList<>();
    //     findPathHelp(root, list, new String());
    //     return list;
    // }

    // public void findPathHelp(TreeNode root, List<String> list, String str) {
    //     if(root == null)
    //         return;
    //     if(str.equals(""))
    //         str += String.valueOf(root.val);
    //     else 
    //         str += "->" + String.valueOf(root.val);
    //     if(root.left == null && root.right == null) {
    //         list.add(str);
    //         return;
    //     }
    //     findPathHelp(root.left, list, str);
    //     findPathHelp(root.right, list, str);    
    // }

    //参照大神的优化方案, 这里有两点改进
    //1. 字符串拼接代价昂贵, 改用StringBuilder   --因为是单线程顺序执行, StringBuilder尽管是是线程不安全的,在它setLength()之前,依然不会污染其它分支
    //2. 对 "->"的处理，我们方便实现递归,同时字符串最后的位置不添加"->",我们将在递归到树下一层之前添加"->"
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> list = new ArrayList<>();
       StringBuilder sb = new StringBuilder();
       helper(root, list, sb);
       return list;
    }

    private void helper(TreeNode root, List<String> list, StringBuilder sb) {
        if(root == null)
            return;
        int len = sb.length();
        sb.append(root.val);
        if(root.left == null && root.right == null)
            list.add(sb.toString());
        else {
            sb.append("->");
            helper(root.left, list, sb);
            helper(root.right, list, sb);
        }
        sb.setLength(len);
    }
}
// @lc code=end

