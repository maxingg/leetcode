/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    /**
     * 利用有序的特点插入
     * 通常的插入我们要考虑移动元素==低效，在得到数组长度并且有序的情况下，赋值将更为高效
     */
    public void merge(int nums1[], int m, int nums2[], int n) {
        int lastIndex1 = m - 1, lastIndex2 = n - 1;
        int lastIndex = m + n - 1;
        while(lastIndex1 >= 0 && lastIndex2 >= 0) 
            nums1[lastIndex--] = nums1[lastIndex1] > nums2[lastIndex2] ? nums1[lastIndex1--] : nums2[lastIndex2--]; 

        //这里的分类很有意思
        //1.若l1(lastIndex1)和l2(lastIndex)同时完成则收工
        //2.若l2完成,l1剩余,由于nums1有序,此时也已是最终结果
        //3.若l1完成,l2剩余,则直接将l2剩余元素插入即可
        while(lastIndex2 >= 0)
            nums1[lastIndex--] = nums2[lastIndex2--];
    }
}
// @lc code=end

