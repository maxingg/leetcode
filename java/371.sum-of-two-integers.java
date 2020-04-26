/*
 * @lc app=leetcode id=371 lang=java
 *
 * [371] Sum of Two Integers
 */

// @lc code=start
class Solution {
    public int getSum(int a, int b) {
        //每位相加有三种情况
        //1. 0 + 0
        //2，0 + 1  本位等于1
        //3. 1 + 1 产生进位1
        //第一种不用考虑，第二，三种分开处理,也就是分别处理和为1和2的情况
        //等到没有进位出现时，运算完成
        if(b == 0)
            return a;
        while(a != 0) {
            int carry = (a & b) << 1;     
            b ^= a; 
            a = carry;
        }
        return b;
    }
}
// @lc code=end

