/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    //根据异或运算的特点: 1）0异或任何数 = 任何数；
    // 2）1异或任何数 = 任何数取反；
    // 3）任何数异或自己 = 把自己置0；
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i = 1; i < nums.length; i++)
            result ^= nums[i];
        return result;
    }

    //Hash解法
    // public int singleNumber(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
    //     for(int i = 0; i < nums.length; i++)
    //         if(!set.contains(nums[i]))
    //             set.add(nums[i]);
    //         else
    //             set.remove(nums[i]);
    //     return set.iterator().next();
    // }
}
// @lc code=end

