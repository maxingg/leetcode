/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        //同27题
        int i = 0, tail = nums.length - 1;
        for(int j = 0; j < nums.length; j++)
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        //填充0
        while(i < nums.length)
            nums[i++] = 0;
    }
}
// @lc code=end

