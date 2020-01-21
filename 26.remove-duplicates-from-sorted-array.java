/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        //这是个人的解决方案并根据官方代码简化
        // int len = nums.length;
        // if(nums.length == 0)
        //     return 0;
        // int i = 0;
        // for(int j = i + 1; j < len; j++) {
        //     if(nums[i] != nums[j]) {
        //         i++;
        //         nums[i] = nums[j];
        //     }
        // }

        // return i + 1;
        int len = nums.length;
        int i = len > 0 ? 1 : 0;
        for (int j = 0; j < len; j++)
            if(nums[j] > nums[i-1]) 
                nums[i++] = nums[j];
        return i;
    }
}
// @lc code=end

