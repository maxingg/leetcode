/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        if(s.length <= 1)
            return;
        int head = 0, tail = s.length - 1;
        while(head < tail) {
            char c = s[head];
            s[head] = s[tail];
            s[tail] = c;
            head++;
            tail--;
        }
    }
}
// @lc code=end

