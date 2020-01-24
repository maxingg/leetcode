/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        //毫无疑问, 这是最优的方法
        int last = nums.length;
        for(int i = 0; i < nums.length; i++) {
            last ^= i;         //XOR 0~last
            last ^= nums[i];   //XOR 0~last,缺少missing这个数
        }
        return last;
        
        //折半查找,思路可以参考下，缺失的值的位置对中间位置和其值大小关系的影响
        // Arrays.sort(nums);
        // int left = 0, right = nums.length, mid = 0;
        // while(left < right) {
        //     mid = left + (right - left) / 2;
        //     if(nums[mid] > mid)
        //         right = mid;
        //     else 
        //         left = mid + 1;
        // }
        // return left;
    }
}
// @lc code=end

