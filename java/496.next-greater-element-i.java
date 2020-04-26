/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
class Solution {
    /**
     * 这个题就算使用栈结构按照常规思路最多也只是O(n^2)
     * 大神的解是直接找出了一种数字排布规律 -- 递减子序列
     * 用栈来实现，那么新进元素若大于栈顶元素，则必然是要查询的结果
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            while(!stack.isEmpty() && stack.peek() < nums2[i])
                map.put(stack.pop(), nums2[i]);
            stack.push(nums2[i]);
        }
        for(int i = 0; i < nums1.length; i++)
            nums1[i] = map.getOrDefault(nums1[i], -1);
        return nums1;
    }
}
// @lc code=end

