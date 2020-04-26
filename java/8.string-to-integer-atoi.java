/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.isEmpty())
            return 0;
        int sign = 1, base = 0, i = 0;
        while(str.charAt(i) == ' ')
            i++;
        if(str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '-' ? -1 : 1;
        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if(base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && (str.charAt(i) - '0' > Integer.MAX_VALUE % 10)))
            //这个数这里保底是2的32次方，取负即为最小值
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            base = 10 * base + (str.charAt(i++) - '0');
        }

        return base * sign;

    }
}
// @lc code=end

