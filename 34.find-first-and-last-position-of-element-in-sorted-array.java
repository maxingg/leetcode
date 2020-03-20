/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    //如何找到第一个，又怎么找到最后一个
    //与其寻找同一个数的首尾位置，不如寻找两个数(target, target+1)的首位置(二分查找易实现)
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return new int[] {-1, -1};
        int start = firstGreaterEqual(nums, target);    //这样就找到了第一个target
        if(start == nums.length || nums[start] != target)
            return new int[]{-1, -1};
        int end = firstGreaterEqual(nums, target + 1);  //如果target+1不存在，则不用减一
        return new int[] {start, nums[end] == target ? end : end - 1};
    }

    private int firstGreaterEqual(int[]nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target)
                start = mid + 1;
            else 
                end = mid;          //我们找的就是第一个大于等于的数的位置，所以这样处理最好
        }
        return end;
    }
}
// @lc code=end

