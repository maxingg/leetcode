/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    /**
     * 斐波那契数列问题, 但这个很难看出来...
     * 讨论已经走了n-1和n-2个台阶情况,此时前者再迈一个台阶,后者直接迈两个台阶
     * 这样两者统计的情况互斥且已包含所有, 即n = (n-1) + (n-2),典型的斐波那契数列。。。
     */
    public int climbStairs(int n) {
        if(n == 1 || n == 2) 
            return n;
        int twoStepsBefore = 1, oneStepBefore = 2, allSetps = 0;
        for(int i = 3; i <= n; i++) {
            allSetps = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allSetps;
        }
        return allSetps;
    }
}
// @lc code=end

