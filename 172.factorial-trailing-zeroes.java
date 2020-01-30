/*
 * @lc app=leetcode id=172 lang=java
 *
 * [172] Factorial Trailing Zeroes
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        //我们的最终目标是找出所有的因子5
        int count = 0;
        while(n != 0){
            n /= 5;
            count += n;
        }
        return count;
    }
}
// @lc code=end

