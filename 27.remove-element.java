
/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 *
 * https://leetcode.com/problems/remove-element/description/
 *
 * algorithms
 * Easy (46.56%)
 * Likes:    1097
 * Dislikes: 2275
 * Total Accepted:    517K
 * Total Submissions: 1.1M
 * Testcase Example:  '[3,2,2,3]\n3'
 *
 * Given an array nums and a value val, remove all instances of that value
 * in-place and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave
 * beyond the new length.
 * 
 * Example 1:
 * 
 * 
 * Given nums = [3,2,2,3], val = 3,
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 2.
 * 
 * It doesn't matter what you leave beyond the returned length.
 * 
 * 
 * Example 2:
 * 
 * 
 * Given nums = [0,1,2,2,3,0,4,2], val = 2,
 * 
 * Your function should return length = 5, with the first five elements of nums
 * containing 0, 1, 3, 0, and 4.
 * 
 * Note that the order of those five elements can be arbitrary.
 * 
 * It doesn't matter what values are set beyond the returned length.
 * 
 * Clarification:
 * 
 * Confused why the returned value is an integer but your answer is an array?
 * 
 * Note that the input array is passed in by reference, which means
 * modification to the input array will be known to the caller as well.
 * 
 * Internally you can think of this:
 * 
 * 
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeElement(nums, val);
 * 
 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len
 * elements.
 * for (int i = 0; i < len; i++) {
 * print(nums[i]);
 * }
 */

// @lc code=start
class Solution {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        //遍历j(快指针)的过程类似于筛选的过程
        //跳过即丢弃，赋值即选择保留
        for(int j = 0; j < nums.length; j++)
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }

        //考虑要删除数据很少的情况，这样要删除的元素越是靠近首部，越是需要更多的赋值操作来保留元素
        //之前的删除操作是跳过，这里就是赋值了
        // int n = nums.length;
        // while(i != n) {
        //     if(nums[i] == val) {
        //         nums[i] = nums[n-1];
        //         n--;
        //     } else {
        //         i++;
        //     }
        // }
        return i;

    }
}
// @lc code=end

