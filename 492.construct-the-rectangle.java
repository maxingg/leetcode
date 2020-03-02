/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 */

// @lc code=start
class Solution {
    //题目很长，但给了很多线索
    //例子中更直接明示可以从平方根入手！！
    public int[] constructRectangle(int area) {
        int num = (int)Math.sqrt(area);
        while(area % num != 0)
            num--;
        return new int[]{area / num, num};
    }
}
// @lc code=end

