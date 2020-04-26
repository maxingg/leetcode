/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */

// @lc code=start
class Solution {
    public boolean isUgly(int num) {
        //原计划使用while-switch
        //我们要找的公因子是2,3,5,
        //考虑到除2可能要很多次,我们先用4把因子2的个数减至最多一个
        while(num % 4 == 0 && num > 1)
            num /= 4;
        for(int i = 2; i < 6 && num > 1; i++)
            while(num % i == 0)
                num /= i;
        return num == 1;
    }
}
// @lc code=end

