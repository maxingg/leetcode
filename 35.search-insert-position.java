/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        //线性的方法很简单
        // for(int i = 0; i < nums.length; i++)
        //     if(nums[i] >= target)
        //         return i;
        // return nums.length;

        //二分查找
        // int low = 0, high = nums.length - 1;
        // while(low <= high) {
        //     int middle = (low + high) / 2;
        //     if(nums[middle] == target)
        //         return middle;
        //     else if(target < nums[middle])
        //         high = middle - 1;
        //     else
        //         low = middle + 1;
        // }
        // return low;

        int low = 0, mid = 0, high = nums.length;
        while(low < high) {
            mid = low + (high - low) / 2;
            if(target <= nums[mid]) 
                high = mid;
            else
                low = mid + 1; 
        }
        return low;
        //因为不知道target的位置,所以我们一直只是用mid试探(比较大小), 以low,high(左右位置上的值,相对而行必然相遇)为对象去逼近!!! 
        //逼近方法为: 在右加1，在左(包括小于等于)直取     ---(符合取数原则)  注意根据具体情况替换
        //low,high可以看成target,因为他们本身就在逼近此值
    }
}
// @lc code=end

