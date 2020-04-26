/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    /**
     * 动态规划问题, 关键先理清问题的核心逻辑,将处理流程一般化
     * 理解盗贼的思路: 我不知道各家有多少钱, 所以只能见一家抢一家(能抢的情况下)   在我抢这一家的时候,此时所获钱财(截至上一次累计所得)肯定是当前最大值
     * 一般化: 抢当前这家(n), 说明我抢了n-2这家;若不能抢这家,说明抢了n-1家
     * 比较这两种情况,取max
     */
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        int prev1 = 0, prev2 = 0;     //抢劫前两家后累计钱财
        for(int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev1, prev2 + num);
            prev2 = tmp;
        }
        return prev1;
    }
}
// @lc code=end

