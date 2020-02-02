/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 */

// @lc code=start
class Solution {
    public int minMoves(int[] nums) {
        //既然n-1个数在某元素移动时加一, 那么便可理解此元素进行了减一操作
        //与加不同,减只针对某特定元素,所以只需所有元素减到数组的最小值即可
        //若是相加因为对n-1个元素操作情况复杂,但最大元素最少也要加1,否则无法相等(彼此的差值不变) 
        if(nums.length == 0)
            return 0;
        int min = nums[0], sum = 0;
        for(int i = 0; i < nums.length; i++)
            min = (min > nums[i]) ? nums[i] : min;
        for(int i = 0; i < nums.length; i++)
            sum += nums[i] - min;
        return sum;
    }
}
// @lc code=end

