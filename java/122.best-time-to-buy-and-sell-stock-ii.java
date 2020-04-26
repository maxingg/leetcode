/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    /**
     * 算法题提倡数学思维, 但算法解决问题思路的最终来源是人类解决实际生活
     * 收益最大可多次买卖, 只要此刻股价继续上升就不抛, 否则立刻抛出，以换取最大利益
     */
    public int maxProfit(int[] prices) {
        int maxSoFar = 0, earnTmp = 0;
        for(int i = 1; i < prices.length; i++) {
            earnTmp = Math.max(prices[i] - prices[i-1], 0);
            maxSoFar += earnTmp;
        }
        return maxSoFar;
    }
}
// @lc code=end

