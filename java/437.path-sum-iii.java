/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
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
     * 寻找给定数的局部路径问题至此我们有了一种有效的思路.
     * 计算集合(树，数组)中每个数的前缀和得到新的集合, 如1,2,-1,-1,2 得到: 1, 3, 2, 1, 3
     * 如果新集合中其中两个数相减得到给定数, 那么就可以得到一条有效路径
     * 实际情况采取高效的方法遍历和查找,这里用dfs
     */
    public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);      //这个零是考虑完整路径要包括根节点的情况
        return pathSumHelp(root, 0, sum, preSum);
    }

    private int pathSumHelp(TreeNode root, int curSum, int sum, Map<Integer, Integer> preSum) {
        if(root == null)
            return 0;
        curSum += root.val;
        int count = preSum.getOrDefault(curSum - sum, 0);
        preSum.put(curSum, preSum.getOrDefault(curSum, 0) + 1);

        count += pathSumHelp(root.left, curSum, sum, preSum) + pathSumHelp(root.right, curSum, sum, preSum);
        preSum.put(curSum, preSum.get(curSum) - 1);    //这里是为了避免污染其它分支
        return count;
    }
}
// @lc code=end

