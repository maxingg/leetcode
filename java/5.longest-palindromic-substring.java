/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
public class Solution {
    /**
     * 动态问题可以理解为对重复调用的子函数利用的过程
     */
    //先来看递归思路，这种情况下复杂度为O(n^2)，因为我们几乎遍历了所有情况
    // private int low = 0, maxLen = 0;

    // public String longestPalindrome(String s) {
    //     char[] chars = s.toCharArray();

    //     if(chars.length < 2) 
    //         return s;
    //     for(int i = 0; i < chars.length; i++) {
    //         helpPalindrome(chars, i, i);    //考虑回文子字符串长度为奇数
    //         helpPalindrome(chars, i, i + 1);    //考虑为偶数
    //     }
    //     return s.substring(low, low + maxLen);
    // }

    // private void helpPalindrome(char[] chars, int i, int j) {
    //     while(i >= 0 && j < chars.length && chars[i] == chars[j]) {
    //         i--;
    //         j++;
    //     }
    //     //注意: 这个时候已经多算了两个位置了, 所以下面的i,j会有些奇怪
    //     if(maxLen < (j - i - 1)) {
    //         low = i + 1;
    //         maxLen = j - i - 1;
    //     }
    // }

    //尽管以上解法测试的效果不错(猜测是i,j同时背向移动的原因)，但却并没有对重复调用的子问题进行利用
    //我们对每一个索引位置都进行了完整的操作
    //对于DP思想,常常可以利用缓存dp(这里是二维数组)
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int nLen = chars.length;
        int curIndex = 0, maxLen = 0;
        boolean[][] dp = new boolean[nLen][nLen];
        for(int i = 0; i < nLen; i++) 
            for(int j = i; j >= 0; j--) {
                if(chars[j] == chars[i] && (i - j < 3 || dp[j + 1][i - 1]))     
                //这里就体现了dp的好处，我们从最小的子字符串(单个字符)开始判断
                //同时记录了所有未来可能遇到位置的dp值,避免了冗余的计算
                    dp[j][i] = true;
                if(dp[j][i] && i - j + 1 > maxLen) {
                    curIndex = j;
                    maxLen = i - j + 1;
                }
            }

        return s.substring(curIndex, curIndex + maxLen);
    }
}
// @lc code=end

