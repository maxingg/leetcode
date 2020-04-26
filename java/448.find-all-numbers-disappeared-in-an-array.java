/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    //我的思路是先插入到HashMap,再一遍判断map.contains(max-nums[i]),最后如果只有一个，则直接加入max
    //另一种,把数值映射到了索引(唯一的)，最后找索引的缺失项，实在高见
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // List<Integer> ret = new ArrayList<Integer>();
        // for(int i = 0; i < nums.length; i++){
        //     int tmp = Math.abs(nums[i]) - 1;    //后面遇到负数先转正才能转变为索引
        //     nums[tmp] = (nums[tmp] > 0) ? -nums[tmp] : nums[tmp];   //用负数作为筛选标记
        // }
        // for(int i = 0; i < nums.length; i++)
        //     if(nums[i] > 0)
        //         ret.add(i + 1);
        // return ret;
    }
}
// @lc code=end
