/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    /**
     * 虽然题目中建议考虑递归,但做题宗旨是万事不递归
     * 思路和递归一样,从零开始演变并将每一次结果交由下次输入,题目本身实在没发现什么捷径可走
     */
    public String countIdx(String s) {
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++)
            if(s.charAt(i) == c) 
                count++;
            else {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
    public String countAndSay(int n) {
       String s = "1";
       for(int i = 1; i < n; i++)
            s = countIdx(s);
        return s;
    }
}
// @lc code=end

