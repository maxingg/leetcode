/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution { 
    /**
     * DP问题
     * 最优解能由子最优解构成
     *时时刻刻作出最优选择 
     */
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];    //记录每个结点的最优解
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < len; i++) {
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
// @lc code=end

