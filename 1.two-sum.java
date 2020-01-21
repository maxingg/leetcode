import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], i);
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     int restElem = target - nums[i];
        //     if(map.containsKey(restElem) && map.get(restElem) != i) {
        //         return new int[]{i, map.get(restElem)};
        //     } 
        // }
        for (int i = 0; i < nums.length; i++) {
            int restElem = target - nums[i];
            if(map.containsKey(restElem) && map.get(restElem) != i) {
                return new int[] { i, map.get(restElem) };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("没有两数和能解决的方案");
    }
}
// @lc code=end

