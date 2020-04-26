/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        //结合第七题的常规思路，但有两个地方可供优化
        //1.可以优先排除个位数为0的特例   2.只反转一半就可以进行最终比较
        // if(x < 0 || (x != 0 && x % 10 == 0))
        //     return false;
        // int reverse = 0, y = x;
        // while(y != 0) {
        //     int tail = y % 10;
        //     reverse = reverse * 10 + tail;
        //     y /= 10;
        // }
        // return x == reverse;

        //优化后的方案
        if(x < 0 || (x != 0 && x % 10 == 0)) 
            return false;
        int reHalf = 0;     //排除特例后再定义变量更好
        while(x > reHalf) {
            reHalf = reHalf * 10 + x % 10;
            x /= 10;
        }
        return (x == reHalf || (reHalf / 10 == x));      //分别对应偶数位和奇数位情况
    }
}
// @lc code=end

