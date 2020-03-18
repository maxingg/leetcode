/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    /**
     * 明题之意，其解自现。。
     * 就算数据旋转，依然可以看成是两个有序的子数组
     * 此时数组中的最小值的位置十分特殊，它同时是区分两个子数组的临界点(可通过二分查找找出,该元素肯定在右子序列)
     * 通过与首节点或尾节点的比较，我们便可以确定应该在哪个子区间进行二叉查找
     */
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int min = findMinIdx(nums);
        if(nums[min] == target)
            return min;
        int n = nums.length;
        int start = (nums[n - 1] >= target) ? min: 0;
        int end = (nums[n - 1] < target) ? min : n - 1;
        //普通的二分法进行收官
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    private int findMinIdx(int[]nums) {
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;      //可能已经是最小点
        }
        return start;
    }
}
// @lc code=end

