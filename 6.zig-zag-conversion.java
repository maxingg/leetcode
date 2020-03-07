/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] ZigZag Conversion
 */

// @lc code=start
class Solution {
    //直观地，可以按照Z字形的路线添加字符
    //关键的是处理字符的存储方式，这里按照行存储,使用StringBuffer，如果是二维数组，则另有n(行数)个位置要记录
    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0; i < sb.length; i++)
            sb[i] = new StringBuffer();
        int i = 0;
        while(i < len) {
            for(int index = 0; index < numRows && i < len; index++)
                sb[index].append(chars[i++]);
            for(int index = numRows - 2; index > 0 && i < len; index--) //斜方向位置的字符
                sb[index].append(chars[i++]);
        }
        //全部元素放在第一排
        for(int index = 1; index < numRows; index++)
            sb[0].append(sb[index]);
        return sb[0].toString();
    }
}
// @lc code=end

