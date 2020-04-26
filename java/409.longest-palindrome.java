/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        char[] sChar = s.toCharArray();
        int[] alphabet = new int[256];
        int count = 0;
        for(int i = 0; i < sChar.length; i++)
            if(++alphabet[sChar[i]] % 2 == 0)
                count += 2;
        return (sChar.length - count != 0) ? count + 1 : count;
    }
}
// @lc code=end

