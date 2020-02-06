/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        //私以为这不能算是算法题,首尾扫描就能解决。。。
        char[] c = s.toCharArray();
        for(int i = 0, j = c.length - 1; i < j;) {
            if(!Character.isLetterOrDigit(c[i]))
                i++;
            else if(!Character.isLetterOrDigit(c[j]))
                j--;
            else if(Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
                return false;
        }
        return true;
    }
}
// @lc code=end

