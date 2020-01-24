/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 恕我愚钝, 第一反应只有这种解法, 这里用快排太不明智了
        Arrays.sort(nums);
        int count = 1;
        for(int i = 1; i < nums.length; i++)
            if(nums[i] == nums[i-1])
                return true;
            else
                count = 1;
        return false;
    }
}
// @lc code=end

