/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        //相当于直接把这个字符串“找”了出来
        //return s.trim().length()-s.trim().lastIndexOf(" ")-1;

        //正向扫描的缺点是对于字符串末尾的空格极难处理(不确定个数),除非用trim()
        // s = s.trim();
        // int i = 0, j = 0;
        // while(j < s.length())
        //     if(s.charAt(j++) == ' ')
        //         i = j;
        // return j - i > 0 ? j - i : 0;

        //而反向扫描克服了这种缺点,直接将末尾多余的空格跳过,而且只需遍历一个单词,提高了效率
        int len = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ' && len > 0)
                return len;
            else if(s.charAt(i) != ' ')
                len++;
        }
        return len;
    }
}
// @lc code=end