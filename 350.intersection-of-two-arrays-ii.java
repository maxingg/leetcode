/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start
class Solution {
    //同上一题，因为记录重复的数字，所以要使用map
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        for(int i = 0; i < nums2.length; i++)
            if(map.getOrDefault(nums2[i], 0) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++)
            result[i] = list.get(i);
        return result;
    }

    //回答延伸的三个问题
    //1，如果数组已经有序，采用二指针法
    //2，如果nums1(m)远小于nums2(n),二叉查找可能更好 O(mlogn)
    //3. 分块读取和处理
}
// @lc code=end

