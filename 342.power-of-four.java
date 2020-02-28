/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    //整个题如果从尾部开始扫描进行 &0b11判断，则首尾难以兼顾
    //4的幂特点是奇数位为1，如果是上述做法，那么与的结果为1时你接下怎么处理？？
    //4的幂肯定也是2的幂，而且1出现在奇数位，并且>0,这就是全部特征！！
    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}
// @lc code=end

