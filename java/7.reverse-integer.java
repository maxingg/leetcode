/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int ret = 0;
        while(x != 0) {
            int tmp = x % 10;
            int newRet = ret * 10 + tmp;
            //((newRet-tmp) / ret != ret)  反映完整的思路max_value+1变成了min_value,你再进行相反的变换也回不去了
            if(newRet / 10 != ret)     
                return 0;
            ret = newRet;
            x /= 10;
        }
        return ret;
    }
}
// @lc code=end

