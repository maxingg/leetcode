/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    // 一维数组的旋转常规思路是移动数组, 但经常可以用高效的赋值代替
    // 右移k个元素,末尾k个元素移动到首部，相当于进行了半翻转
    // 此时考虑将前k个元素反转,剩余元素再进行一次反转,则结果为原数组整个反转,整个思维逆向即为我们需要的操作

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
}
// @lc code=end

