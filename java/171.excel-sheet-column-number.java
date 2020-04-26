/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    //没什么说的,直接算就完了
    public int titleToNumber(String s) {
        int i = 0, ret = 0;
        while(i < s.length())
            ret = ret * 26 + s.charAt(i++) - 'A' + 1;
        return ret;
    }
}
// @lc code=end

