/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //这个题的关键就是当遇到重复字符时的处理，可以使用滑动窗口(双指针实现)也是基于问题的这个性质
        //注意: 当遇到重复字符时，再次寻找的起始位置应该是重复字符的上一个位置+1
        int[] map  = new int[256];
        int count = 0;
        char[] chars = s.toCharArray();

        //慎重!!: 这里直接给字符附右相邻位置的值是考虑到数组值默认为0,如果map[chars[i]]=i,那么判断j是否出现就必须是>=0,但这样始终会选择Math.max(j, map[chars[i]])
        for(int i = 0, j = 0; i < chars.length; i++) {
            j = (map[chars[i]] > 0) ? Math.max(j, map[chars[i]]) : j;    //使用max是防止max()使得j出现回溯发生错误
            map[chars[i]] = i + 1;
            count = Math.max(count, i - j + 1);
        }
        return count;

        //也可以使用队列或set实现，窗口思想更明显
        // int maxLen = 0;
        // int right = 0, left = 0;
        // Set<Character> window = new HashSet<>();
        // char[] chars = s.toCharArray();
        // while(right < chars.length) {
        //     while(window.contains(chars[right]))
        //         window.remove(chars[left++]);       //这里清除的是包括左重复字符和其左边所有元素
        //     window.add(chars[right++]);
        //     maxLen = Math.max(maxLen, right - left);
        // }
        // return maxLen;
    }
}
// @lc code=end

