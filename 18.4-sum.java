/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //回想一下15和16题，是对3个数的求和进行判断
        //那么处理四个数就意味着再加上一层循环,判断 四个数相加和是否等于target即可
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 4)
            return res;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1])     //这个判断条件可以和15题类比下
                continue;
            for(int j = i + 1; j < nums.length - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int left = j + 1, right = nums.length - 1;
                while(left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left + 1])
                            left++;
                        while(left < right && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if(sum < target)
                        left++;
                    else
                        right--;
                }
            }
        }
        return res;
            
        //但到了四以上已经可以考虑递归了，否则循环层数太多了
        //评论的总结很到位,其实这种相加和等于某个数的问题可分为两种情况
        //2sum Problem
        //Reduce K sum problem to K – 1 sum Problem
        
    }
}
// @lc code=end

