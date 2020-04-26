/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //思路同15题
        int result = nums[0] + nums[1] + nums[nums.length - 1]; //注意初始化不能为0，可能target就是0!!
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++)
            if(i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1, high = nums.length - 1;
                while(low < high) {
                    int sum = nums[i] + nums[low] + nums[high];
                    if(Math.abs(sum - target) < Math.abs(result - target))
                        result = sum;
                    if(sum > target)
                        high--;
                    else if(sum < target)
                        low++;
                    else
                        return result;
                }
            }
        return result;
    }
}
// @lc code=end

