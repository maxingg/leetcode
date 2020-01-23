/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    /**
     * 反思: 第一次做这个题完全没考虑n/2这个条件走了很多弯路。。
     */
    public int majorityElement(int[] nums) {
        //第一种思路: 无论数字出现的顺序如何,依据>n/2这个特点, 最终count>0,并且major正确
        int major = nums[0], count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {    //窥探到DP的痕迹: 与子最优解结合(是major则count>0,若count==0之前的数字中比必不存在major)
                count++;
                major = nums[i];
            }else if(major == nums[i])
                count++;
            else
                count--;
        }

        // return major;

        //快排...简单吧   与第一种效率相当
        // Arrays.sort(nums);
        // return nums[nums.length / 2];

        //HashMap
        // int result = 0;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num : nums) {
        //     if(map.containsKey(num))
        //         map.put(num, map.get(num)+1);
        //     else
        //         map.put(num, 1);
        //     if(map.get(num) > nums.length / 2)
        //         result = num;
        // }
        // return result;
    }

}
// @lc code=end

