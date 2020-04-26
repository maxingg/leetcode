/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    //这个题用到一个很重要的公式: num1[i] * num2[j]` will be placed at pos `[i + j`, `i + j + 1]`
    //这样我们每一次循环的操作都是在处理pos的相应位置 
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] pos = new int[len1 + len2];   //乘积结果的最大长度

        for(int i = len1 - 1; i >= 0; i--)
            for(int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];    //注意这个位置之前计算保留的值

                pos[p2] = sum % 10;
                pos[p1] += sum / 10;
            }

        StringBuilder sb = new StringBuilder();
        for(int p : pos)
            if(!(sb.length() == 0 && p == 0))       //数字最高位的0舍去
                sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
// @lc code=end

