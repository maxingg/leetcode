/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
    /**
     * 呵呵，没什么感觉
     * 我尽量用最小的供给取满足最多的需求
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j = 0; i < g.length && j < s.length; j++)
            if(g[i] <= s[j])
                i++;
        return i;
    }
}
// @lc code=end

