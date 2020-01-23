/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    /**
     * 我认为做这个题需要你的数学思维好一点...,也可以形象的来认识
     * 53题最大子数组问题所给数组可以看作股价跌涨图，本题则是给出具体的股市数据。
     * 两个题都是利用股市涨跌获得最大收益，有了具体的股市数据，自然能得到股价跌张图, 从而转换为最大子数组问题
     */
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;     //当前的最大收益和迄今为止的最大收益
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(maxCur += prices[i] - prices[i-1], 0);   // = dp[i]
            maxSoFar = Math.max(maxCur, maxSoFar);
        }

        return maxSoFar;
    }
}
// @lc code=end

