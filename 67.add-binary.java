/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        //想办法转化为数值运算即可
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while(i >= 0 || j >= 0) {
            int sum  = carry;   //先将进位的值加上
            if(i >= 0)
                sum += a.charAt(i--) - '0';
            if(j >= 0)
                sum += b.charAt(j--) - '0';
            sb.append(sum % 2);   //若进位，则本位剩余数值
            carry = sum / 2;
        }
        if(carry != 0)
            sb.append(1);
        return sb.reverse().toString();
    }
}
// @lc code=end

