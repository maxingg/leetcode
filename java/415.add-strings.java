/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */ 

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        //这个题的求和运算很经典:
        //1.对carry的处理
        //2.对两个数组长度的处理
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        char[] n1 = num1.toCharArray(), n2 = num2.toCharArray();
        for(int i = n1.length - 1, j = n2.length - 1; i >= 0 || j >= 0 || carry == 1;i--, j--) {
            int x = i < 0 ? 0 : n1[i] - '0';
            int y = j < 0 ? 0 : n2[j] - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

