/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        //效率太低, 可以优化到O(1)
        //等差数列问题, x*(x + 1) / 2 = n(也可以用二叉查找)
        //解得: x = (sqrt(8n + 1) - 1) / 2
        // int i = 0;
        // while(n > 0) {
        //     i += 1;
        //     n -= i;
        // }
        // return n == 0 ? i : i - 1;

        return (int)(Math.sqrt(1 + 8 * (long)n) - 1);
    }
}
// @lc code=end

