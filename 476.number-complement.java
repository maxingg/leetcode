/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        //观察数字规律，以1011举例，该正数反码为0100,相加为1111
        int n = 0;
        while(n < num)
            n = (n << 1) | 1;
        return n - num;
    }
}
// @lc code=end

