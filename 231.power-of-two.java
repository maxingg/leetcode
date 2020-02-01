/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        //所有2的n次幂数:  100...00
        //找到第一个1,右移后此数必为0
        // if(n == 1)
        //     return true;
        // while(n != 0) {
        //     int tmp = n & 1;
        //     n = n >> 1;
        //     if(tmp == 1) {
        //         //    右移遇到第一个1就要判断并结束程序
        //         if(n == 0)
        //             return true;
        //         else
        //             return false;
        //     } 
        // }
        // return false;

        //这个题按照上面的解法说明你知道了正确的数字二进制形式和规律, 但还没有活用二进制数字性质
        return ((n & (n-1))== 0 && n > 0)     //举例: 4: 100  3: 011
    }
}
// @lc code=end

