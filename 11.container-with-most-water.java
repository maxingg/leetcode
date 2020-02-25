/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    /**
     * 此问题要用到这个结论:
     * ai < aj we will check the next (i+1, j) (or move i to the right)
     * ai >= aj we will check the next (i, j-1) (or move j to the left)
     * 放入参考链接: https://leetcode.com/problems/container-with-most-water/discuss/200246/Proof-by-formula
     */
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0, j = height.length - 1;
        while(i < j) {
            area = Math.max(area, (j - i) * Math.min(height[i], height[j]));
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        return area;
    }
}
// @lc code=end

