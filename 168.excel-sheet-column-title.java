/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        //实际上这可看作是26进制数的转换
        // String str = "";
        // while(n != 0) {
        //     int tmp = --n % 26;       //26进制数应该是0-25
        //     char c = (char)('A' + tmp);
        //     str = c + str;
        //     n /= 26;
        // }
        // return str;
        StringBuilder result = new StringBuilder();

        while(n>0){
            result.insert(0, (char)('A' + --n % 26));
            n /= 26;
        }

        return result.toString();
        
    }
}
// @lc code=end

