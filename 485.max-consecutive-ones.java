/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //很简单，不解释
        int curCount = 0, maxCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                curCount++;
                if(maxCount < curCount)
                    maxCount = curCount;
            }
            else 
                curCount = 0;
        }
        return maxCount;

        //精简版
        // int maxHere = 0, max = 0;
        // for (int n : nums)
        //     max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        // return max; 
    }
}
// @lc code=end

