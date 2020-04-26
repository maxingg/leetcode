/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        //二分查找法
        // if(num == 1)
        //     return true;
        // int low = 1, high = num / 2;
        // while(low <= high) {
        //     // mid * mid 很可能超出int范围,所以用long
        //     long mid = low + (high - low) / 2;
        //     if(mid * mid == num)
        //         return true;
        //     else if(mid * mid < num)
        //         low = (int)mid + 1;
        //     else
        //         high = (int)mid - 1;
        // }
        // return false;

        //这里还可以用牛顿迭代法
        long x = num;
        while(x * x > num) 
            x = (x + num / x) >> 1;
        return x * x == num;
    }
}
// @lc code=end

