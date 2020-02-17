/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        //异或即可
        char[] sChar = s.toCharArray(), tChar = t.toCharArray();
        char c = tChar[sChar.length];
        for(int i = 0; i < sChar.length; i++) {
            c ^= sChar[i];
            c ^= tChar[i];
        }
        return c;
    }
}
// @lc code=end

