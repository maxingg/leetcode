/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //这是我的常规解法
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++) {
        //     if(map.containsKey(nums[i])) {
        //         int j = map.get(nums[i]);
        //         if(i - j <= k)
        //             return true;
        //     }
        //     map.put(nums[i], i);
        // }
        
        // return false;

        //不得不感叹大神的思维, 用滑动窗口的思想来解决,妙极
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > k)
                set.remove(nums[i-k-1]);
            if(!set.add(nums[i]))   //添加失败,意味着已经存在, 且此时间距<=k
                return true;
        }
        return false;
    }   
}
// @lc code=end

