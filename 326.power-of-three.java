/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        //不用循环的话,int范围内最大的是 3^19,这样只要n是3^n就能整除
        return ( n > 0 &&  1162261467 % n == 0);
    }
}
// @lc code=end

