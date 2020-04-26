/*
 * @lc app=leetcode id=475 lang=java
 *
 * [475] Heaters
 */

// @lc code=start
class Solution {
    /**
     * 这里二叉查找仅用来查找房子所在的加热器位置
     * 注意 Arrays.binarySearch()查找失败时，返回返回 (-(插入点) - 1
     * 我们找到每个房子距离加热器的最小半径(根据左右加热器位置)，最终取最大值即可
     */
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int radius = 0;
        for(int house : houses) {
            int index = Arrays.binarySearch(heaters, house);
            if(index < 0) {      //如果index为整数，说明房子位置跟加热器重叠，反而不用考虑了
                index = ~index;
                //考虑左右边界
                int leftDist = index >= 1 ? house - heaters[index - 1] : Integer.MAX_VALUE;           //距离左边加热器距离
                int rightDist = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;  //距离右边...
                radius = Math.max(radius, Math.min(leftDist, rightDist));
            }
        }
        return radius;
    }
}
// @lc code=end

