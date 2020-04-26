/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */

// @lc code=start
class Solution {
    //这个题目个人觉得不好,将在现实中毫无逻辑的字符串也作为测试处理(",,,      ,sjib")
    public int countSegments(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) 
            //这里处理得比较巧妙, 从零位置开始并且非空格必然是单词, 同时避免了i-1<0
            if(chars[i] != ' ' && (i == 0 || chars[i-1] == ' '))
                res++;
        return res;
    }
}
// @lc code=end

