/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 */

// @lc code=start
class Solution {
    //只是简单的转16进制，别想歪了。。
    //可以用上final表示静态资源，StringBuilder提高效率
    public final char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public String toHex(int num) {
        if(num == 0)
            return "0";
        StringBuilder res = new StringBuilder();
        while(num != 0) {
            res.insert(0, map[num & 0xf]);
            num >>>= 4;     //考虑到负数，这里用逻辑移位
        }
        return res.toString();
    }
}
// @lc code=end

