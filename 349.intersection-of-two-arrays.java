/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    //借助快排我们可以实现一次遍历查找出交集set,但快排的性能不稳定
    // public int[] intersection(int[] nums1, int[] nums2) {
    //     Set<Integer> set = new HashSet<>();
    //     Arrays.sort(nums1);
    //     Arrays.sort(nums2);
    //     int i = 0, j = 0;
    //     while(i < nums1.length && j < nums2.length)
    //         if(nums1[i] < nums2[j])
    //             i++;
    //         else if(nums1[i] > nums2[j])
    //             j++;
    //         else{
    //             set.add(nums1[i++]);
    //             j++;
    //         }
    //     int[] result = new int[set.size()];
    //     i = 0;
    //     for(Integer num : set)
    //         result[i++] = num;
    //     return result;
    // }

    //上常规方法: 建立nums1的set集合，再遍历nums2筛选出交集
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }

    //还有一种思路,一次数组快排+二分查找
}
// @lc code=end

