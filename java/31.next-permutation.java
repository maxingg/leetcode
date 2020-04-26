/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    /**
     * 说实话，这个题有点难懂。。
     * 所谓下一个更大的字符串可类比为十进制数:1432 -> 2134
     */
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if(len < 2)
            return; 
        int index = len - 1;
        while(index > 0) {
            if(nums[index - 1] < nums[index])
                break;
            index--;
        }
        if(index == 0) {
            reverseSort(nums, 0, len - 1);
            return;
        }
        else {
            int tar = len - 1;
            while(tar >= index) {
                if(nums[index - 1] < nums[tar]) {
                    swap(nums, index - 1, tar);
                    reverseSort(nums, index, len - 1);
                    break;
                }
                tar--;
            }
        }
    }

    private void reverseSort(int[] nums, int i, int j) {
        while(i < j)
            swap(nums,i++, j--);
    }

    private void swap(int[]nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
// @lc code=end

