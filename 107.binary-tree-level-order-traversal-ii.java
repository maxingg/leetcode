/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
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
    //BFS  广度优先不需要递归,深度才是
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root == null)
            return wrapList;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i = 0; i < levelNum; i++) {
                if(queue.peek().left != null) 
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null) 
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(0, subList);
        }

        return wrapList;
    }

    //DFS  此题本意是广度优先,用深度优先就必须能找出插入顺序(size()-level-1)
    // public List<List<Integer>> levelOrderBottom(TreeNode root) {
    //     List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
    //     levelMaker(root, wrapList, 0);
    //     return wrapList;
    // }

    // public void levelMaker(TreeNode root, List<List<Integer>> wrapList, int level) {
    //     if(root == null)
    //         return;
    //     if(level == wrapList.size())
    //         wrapList.add(0, new LinkedList<Integer>());
    //     levelMaker(root.left, wrapList, level + 1);
    //     levelMaker(root.right, wrapList, level + 1);
    //     wrapList.get(wrapList.size() - level - 1).add(root.val);
    // }

}
// @lc code=end

